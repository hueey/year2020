package com.cloud.kailuan.yjindex.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.cloud.kailuan.yjindex.dao.ISysConfigDao;
import com.cloud.kailuan.yjindex.db.tables.records.*;
import com.cloud.kailuan.yjindex.service.ISysConfigService;
import com.cloud.kailuan.yjindex.vo.*;
import com.google.common.collect.Lists;
import io.swagger.annotations.ApiModelProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author pjh
 * @Title: SysConfigServiceImpl
 * @Description: 系统配置服务
 * @date 2020/9/20 15:56
 */
@Service
@Slf4j
public class SysConfigServiceImpl implements ISysConfigService {

    @Autowired
    ISysConfigDao sysConfigDao;


    @Override
    public void saveHomeConfig(LcHomeConfigVo lcHomeConfigVo) {

        LcHeaderConfVo lcHeaderConfVo = lcHomeConfigVo.getLcHeaderConfVo();
        saveLcHeaderConfVo(lcHeaderConfVo);

        List<LcHomeBannerConfVo> lcHomeBannerConfVos = lcHomeConfigVo.getLcHomeBannerConfVos();
        saveLcHomeBannerConfVo(lcHomeBannerConfVos);

        List<LcAppModuleConfVo> lcAppModuleConfVos = lcHomeConfigVo.getLcAppModuleConfVos();
        saveLcAppModuleConfVo(lcAppModuleConfVos);

        List<LcInfoBannerConfVo> lcInfoBannerConfVos = lcHomeConfigVo.getLcInfoBannerConfVos();
        saveLcInfoBannerConfVo(lcInfoBannerConfVos);

    }

    /**
     * 保存头部配置  保证只有一个配置 如果存在多余的要将多余的删除掉
     * @param lcHeaderConfVo
     */
    private void saveLcHeaderConfVo(LcHeaderConfVo lcHeaderConfVo) {
        if (ObjectUtil.isEmpty(lcHeaderConfVo)) {
            return;
        }
        //保证有效头部配置只有一条
        singleLcHeaderConfHandle( lcHeaderConfVo.getId() );

        LcHeaderConfRecord lcHeaderConfRecord = new LcHeaderConfRecord();
        lcHeaderConfRecord.setId(lcHeaderConfVo.getId());
        lcHeaderConfRecord.setHeaderName(lcHeaderConfVo.getHeaderName());
        lcHeaderConfRecord.setRgbColor(lcHeaderConfVo.getRgbColor());
        lcHeaderConfRecord.setLogoFileUrl(lcHeaderConfVo.getLogoFileUrl());
        lcHeaderConfRecord.setBgFileUrl(lcHeaderConfVo.getBgFileUrl());
        lcHeaderConfRecord.setDelFlag((byte) 1);
        if (lcHeaderConfVo.getId() == null) {
            lcHeaderConfRecord.setCreateBy("");
            lcHeaderConfRecord.setCreateDate(LocalDateTime.now());
        }
        lcHeaderConfRecord.setUpdateBy("");
        lcHeaderConfRecord.setUpdateDate(LocalDateTime.now());
        String status = lcHeaderConfVo.getStatus();
        if (StrUtil.isBlank(status)) {
            lcHeaderConfRecord.setStatus("1");
        } else {
            lcHeaderConfRecord.setStatus(lcHeaderConfVo.getStatus());
        }
        sysConfigDao.saveLcHeaderConfRecord(lcHeaderConfRecord);
        lcHeaderConfVo.setId(lcHeaderConfRecord.getId());
    }

    /**
     * 保证有效头部配置只有一条
     * @param id
     */
    private void singleLcHeaderConfHandle(Long id) {
        sysConfigDao.delAndRetainSingleLcHeaderConf( id );
    }

    private void saveLcInfoBannerConfVo(List<LcInfoBannerConfVo> lcInfoBannerConfVos) {
        if (ObjectUtil.isEmpty(lcInfoBannerConfVos)) {
            return;
        }
        for (int i = 0; i < lcInfoBannerConfVos.size(); i++) {
            LcInfoBannerConfVo lcInfoBannerConfVo = lcInfoBannerConfVos.get(i);
            LcInfoBannerConfRecord lcInfoBannerConfRecord = new LcInfoBannerConfRecord();
            lcInfoBannerConfRecord.setId(lcInfoBannerConfVo.getId());
            lcInfoBannerConfRecord.setTitle(lcInfoBannerConfVo.getTitle());
            lcInfoBannerConfRecord.setAdImgUrl(lcInfoBannerConfVo.getAdImgUrl());
            lcInfoBannerConfRecord.setAdImgLinkType(lcInfoBannerConfVo.getAdImgLinkType());
            lcInfoBannerConfRecord.setAdImgLinkUrl(lcInfoBannerConfVo.getAdImgLinkUrl());
            lcInfoBannerConfRecord.setDispOr(i);

            Integer delFlag = lcInfoBannerConfVo.getDelFlag();
            if (delFlag == null) {
                lcInfoBannerConfRecord.setDelFlag((byte) 0);
            } else {
                lcInfoBannerConfRecord.setDelFlag(delFlag.byteValue());
            }
            if (lcInfoBannerConfRecord.getId() == null) {
                lcInfoBannerConfRecord.setCreateBy("");
                lcInfoBannerConfRecord.setCreateDate(LocalDateTime.now());
            }
            lcInfoBannerConfRecord.setUpdateBy("");
            lcInfoBannerConfRecord.setUpdateDate(LocalDateTime.now());
            String status = lcInfoBannerConfVo.getStatus();
            if (StrUtil.isBlank(status)) {
                lcInfoBannerConfRecord.setStatus("1");
            } else {
                lcInfoBannerConfRecord.setStatus(lcInfoBannerConfVo.getStatus());
            }
            sysConfigDao.saveLcInfoBannerConfRecord(lcInfoBannerConfRecord);
            lcInfoBannerConfVo.setId(lcInfoBannerConfRecord.getId());
        }

    }

    private void saveLcAppModuleConfVo(List<LcAppModuleConfVo> lcAppModuleConfVos) {
        if (ObjectUtil.isEmpty(lcAppModuleConfVos)) {
            return;
        }

        for (int i = 0; i < lcAppModuleConfVos.size(); i++) {
            LcAppModuleConfVo lcAppModuleConfVo = lcAppModuleConfVos.get(i);
            LcAppModuleConfRecord lcAppModuleConfRecord = new LcAppModuleConfRecord();
            lcAppModuleConfRecord.setId(lcAppModuleConfVo.getId());
            lcAppModuleConfRecord.setTitle(lcAppModuleConfVo.getTitle());
            lcAppModuleConfRecord.setIcoUrl(lcAppModuleConfVo.getIcoUrl());
            lcAppModuleConfRecord.setIcoLinkType(lcAppModuleConfVo.getIcoLinkType());
            lcAppModuleConfRecord.setIcoLinkUrl(lcAppModuleConfVo.getIcoLinkUrl());
            lcAppModuleConfRecord.setDispOr(i);

            Integer delFlag = lcAppModuleConfVo.getDelFlag();
            if (delFlag == null) {
                lcAppModuleConfRecord.setDelFlag((byte) 0);
            } else {
                lcAppModuleConfRecord.setDelFlag(delFlag.byteValue());
            }
            if (lcAppModuleConfVo.getId() == null) {
                lcAppModuleConfRecord.setCreateBy("");
                lcAppModuleConfRecord.setCreateDate(LocalDateTime.now());
            }
            lcAppModuleConfRecord.setUpdateBy("");
            lcAppModuleConfRecord.setUpdateDate(LocalDateTime.now());
            String status = lcAppModuleConfVo.getStatus();
            if (StrUtil.isBlank(status)) {
                lcAppModuleConfRecord.setStatus("1");
            } else {
                lcAppModuleConfRecord.setStatus(lcAppModuleConfVo.getStatus());
            }
            sysConfigDao.saveLcAppModuleConfRecord(lcAppModuleConfRecord);
            lcAppModuleConfVo.setId(lcAppModuleConfRecord.getId());
        }


    }

    private void saveLcHomeBannerConfVo(List<LcHomeBannerConfVo> lcHomeBannerConfVos) {
        if (ObjectUtil.isEmpty(lcHomeBannerConfVos)) {
            return;
        }

        for (int i = 0; i < lcHomeBannerConfVos.size(); i++) {
            LcHomeBannerConfVo lcHomeBannerConfVo = lcHomeBannerConfVos.get(i);
            LcHomeBannerConfRecord lcHomeBannerConfRecord = new LcHomeBannerConfRecord();
            lcHomeBannerConfRecord.setId(lcHomeBannerConfVo.getId());
            lcHomeBannerConfRecord.setTitle(lcHomeBannerConfVo.getTitle());
            lcHomeBannerConfRecord.setAdImgUrl(lcHomeBannerConfVo.getAdImgUrl());
            lcHomeBannerConfRecord.setAdImgLinkType(lcHomeBannerConfVo.getAdImgLinkType());
            lcHomeBannerConfRecord.setAdImgLinkUrl(lcHomeBannerConfVo.getAdImgLinkUrl());
            lcHomeBannerConfRecord.setDispOr(i);

            Integer delFlag = lcHomeBannerConfVo.getDelFlag();
            if (delFlag == null) {
                lcHomeBannerConfRecord.setDelFlag((byte) 0);
            } else {
                lcHomeBannerConfRecord.setDelFlag(delFlag.byteValue());
            }
            if (lcHomeBannerConfVo.getId() == null) {
                lcHomeBannerConfRecord.setCreateBy("");
                lcHomeBannerConfRecord.setCreateDate(LocalDateTime.now());
            }
            lcHomeBannerConfRecord.setUpdateBy("");
            lcHomeBannerConfRecord.setUpdateDate(LocalDateTime.now());
            String status = lcHomeBannerConfVo.getStatus();
            if (StrUtil.isBlank(status)) {
                lcHomeBannerConfRecord.setStatus("1");
            } else {
                lcHomeBannerConfRecord.setStatus(lcHomeBannerConfVo.getStatus());
            }
            sysConfigDao.saveLcHomeBannerConfRecord(lcHomeBannerConfRecord);
            lcHomeBannerConfVo.setId(lcHomeBannerConfRecord.getId());
        }

    }


    @Override
    public LcHomeConfigVo findHomeConfig() {


        LcHomeConfigVo lcHomeConfigVo = new LcHomeConfigVo();

        LcHeaderConfRecord lcHeaderConfRecord = sysConfigDao.selectLcHeaderConfRecord();
        LcHeaderConfVo lcHeaderConfVo = new LcHeaderConfVo();
        if( lcHeaderConfRecord!=null ){
            lcHeaderConfVo.setId(lcHeaderConfRecord.getId());
            lcHeaderConfVo.setHeaderName(lcHeaderConfRecord.getHeaderName());
            lcHeaderConfVo.setRgbColor(lcHeaderConfRecord.getRgbColor());
            lcHeaderConfVo.setLogoFileUrl(lcHeaderConfRecord.getLogoFileUrl());
            lcHeaderConfVo.setBgFileUrl(lcHeaderConfRecord.getBgFileUrl());
            lcHeaderConfVo.setStatus(lcHeaderConfRecord.getStatus());
        }
        lcHomeConfigVo.setLcHeaderConfVo( lcHeaderConfVo );

        List<LcHomeBannerConfVo> lcHomeBannerConfVos = Lists.newArrayList();
        List<LcHomeBannerConfRecord> lcHomeBannerConfRecords = sysConfigDao.selectLcHomeBannerConfRecords();
        for (LcHomeBannerConfRecord lcHomeBannerConfRecord : lcHomeBannerConfRecords) {
            LcHomeBannerConfVo lcHomeBannerConfVo = new LcHomeBannerConfVo();
            lcHomeBannerConfVo.setId(lcHomeBannerConfRecord.getId());
            lcHomeBannerConfVo.setTitle(lcHomeBannerConfRecord.getTitle());
            lcHomeBannerConfVo.setAdImgUrl(lcHomeBannerConfRecord.getAdImgUrl());
            lcHomeBannerConfVo.setAdImgLinkType(lcHomeBannerConfRecord.getAdImgLinkType());
            lcHomeBannerConfVo.setAdImgLinkUrl(lcHomeBannerConfRecord.getAdImgLinkUrl());
            lcHomeBannerConfVo.setRemark(lcHomeBannerConfRecord.getRemark());
            lcHomeBannerConfVo.setStatus(lcHomeBannerConfRecord.getStatus());
            lcHomeBannerConfVo.setDelFlag(lcHomeBannerConfRecord.getDelFlag().intValue());

            lcHomeBannerConfVos.add(lcHomeBannerConfVo);
        }
        lcHomeConfigVo.setLcHomeBannerConfVos( lcHomeBannerConfVos );

        List<LcAppModuleConfVo> lcAppModuleConfVos = Lists.newArrayList();
        List<LcAppModuleConfRecord> lcAppModuleConfRecords = sysConfigDao.selectLcAppModuleConfRecords();
        for (LcAppModuleConfRecord lcAppModuleConfRecord : lcAppModuleConfRecords) {
            LcAppModuleConfVo lcAppModuleConfVo = new LcAppModuleConfVo();
            lcAppModuleConfVo.setId(lcAppModuleConfRecord.getId());
            lcAppModuleConfVo.setTitle(lcAppModuleConfRecord.getTitle());
            lcAppModuleConfVo.setIcoUrl(lcAppModuleConfRecord.getIcoUrl());
            lcAppModuleConfVo.setIcoLinkType(lcAppModuleConfRecord.getIcoLinkType());
            lcAppModuleConfVo.setIcoLinkUrl( lcAppModuleConfRecord.getIcoLinkUrl() );
            lcAppModuleConfVo.setRemark( lcAppModuleConfRecord.getRemark() );
            lcAppModuleConfVo.setStatus(lcAppModuleConfRecord.getStatus());
            lcAppModuleConfVo.setDelFlag(lcAppModuleConfRecord.getDelFlag().intValue());

            lcAppModuleConfVos.add(lcAppModuleConfVo);
        }
        lcHomeConfigVo.setLcAppModuleConfVos( lcAppModuleConfVos );

        List<LcInfoBannerConfVo> lcInfoBannerConfVos = Lists.newArrayList();
        List<LcInfoBannerConfRecord> lcInfoBannerConfRecords = sysConfigDao.selectLcInfoBannerConfRecords();
        for (LcInfoBannerConfRecord lcInfoBannerConfRecord : lcInfoBannerConfRecords) {
            LcInfoBannerConfVo lcInfoBannerConfVo = new LcInfoBannerConfVo();
            lcInfoBannerConfVo.setId(lcInfoBannerConfRecord.getId());
            lcInfoBannerConfVo.setTitle(lcInfoBannerConfRecord.getTitle());
            lcInfoBannerConfVo.setAdImgUrl(lcInfoBannerConfRecord.getAdImgUrl());
            lcInfoBannerConfVo.setAdImgLinkType(lcInfoBannerConfRecord.getAdImgLinkType());
            lcInfoBannerConfVo.setAdImgLinkUrl(lcInfoBannerConfRecord.getAdImgLinkUrl());
            lcInfoBannerConfVo.setRemark(lcInfoBannerConfRecord.getRemark());
            lcInfoBannerConfVo.setStatus(lcInfoBannerConfRecord.getStatus());
            lcInfoBannerConfVo.setDelFlag(lcInfoBannerConfRecord.getDelFlag().intValue());

            lcInfoBannerConfVos.add(lcInfoBannerConfVo);
        }
        lcHomeConfigVo.setLcInfoBannerConfVos( lcInfoBannerConfVos );

        return lcHomeConfigVo;
    }

    @Override
    public void saveInstallPackage(LcAppInfoVo lcAppInfoVo) {

        LcAppInfoRecord lcAppInfoRecord = new LcAppInfoRecord();
        lcAppInfoRecord.setId( lcAppInfoVo.getId() );
        lcAppInfoRecord.setAppName( lcAppInfoVo.getAppName() );
        lcAppInfoRecord.setPlatformType( lcAppInfoVo.getPlatformType() );
        lcAppInfoRecord.setAppVersion( lcAppInfoVo.getAppVersion() );
        lcAppInfoRecord.setVersionInfo( lcAppInfoVo.getVersionInfo() );
        lcAppInfoRecord.setAppUrl( lcAppInfoVo.getAppUrl() );

        Integer delFlag = lcAppInfoVo.getDelFlag();
        if (delFlag == null) {
            lcAppInfoRecord.setDelFlag((byte) 0);
        } else {
            lcAppInfoRecord.setDelFlag(delFlag.byteValue());
        }
        if (lcAppInfoVo.getId() == null) {
            lcAppInfoRecord.setCreateBy("");
            lcAppInfoRecord.setCreateDate(LocalDateTime.now());
        }
        lcAppInfoRecord.setUpdateBy("");
        lcAppInfoRecord.setUpdateDate(LocalDateTime.now());

        sysConfigDao.saveLcAppInfoRecord( lcAppInfoRecord );
        lcAppInfoVo.setId( lcAppInfoRecord.getId() );

    }

    @Override
    public List<LcAppInfoVo> getInstallPackageInfos() {
        return null;
    }

}
