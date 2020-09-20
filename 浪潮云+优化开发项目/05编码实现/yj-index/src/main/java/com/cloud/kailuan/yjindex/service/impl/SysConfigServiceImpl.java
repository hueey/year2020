package com.cloud.kailuan.yjindex.service.impl;

import com.cloud.kailuan.yjindex.service.ISysConfigService;
import com.cloud.kailuan.yjindex.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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


    @Override
    public LcHomeConfigVo saveHomeConfig(LcHeaderConfVo lcHeaderConfVo, List<LcHomeBannerConfVo> lcHomeBannerConfVos, List<LcAppModuleConfVo> lcAppModuleConfVos, List<LcInfoBannerConfVo> lcInfoBannerConfVos) {
        return null;
    }

    @Override
    public LcHomeConfigVo findHomeConfig() {
        return null;
    }

    @Override
    public void saveInstallPackage(LcAppInfoVo lcAppInfoVo) {

    }

    @Override
    public List<LcAppInfoVo> getInstallPackageInfos() {
        return null;
    }

}
