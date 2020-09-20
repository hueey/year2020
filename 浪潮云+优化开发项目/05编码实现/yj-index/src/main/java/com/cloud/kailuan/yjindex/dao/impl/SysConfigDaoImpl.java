package com.cloud.kailuan.yjindex.dao.impl;

import com.cloud.kailuan.yjindex.dao.IIDGenerate;
import com.cloud.kailuan.yjindex.dao.ISysConfigDao;
import com.cloud.kailuan.yjindex.db.Tables;
import com.cloud.kailuan.yjindex.db.tables.LcAppModuleConf;
import com.cloud.kailuan.yjindex.db.tables.LcHeaderConf;
import com.cloud.kailuan.yjindex.db.tables.LcHomeBannerConf;
import com.cloud.kailuan.yjindex.db.tables.LcInfoBannerConf;
import com.cloud.kailuan.yjindex.db.tables.records.*;
import lombok.extern.slf4j.Slf4j;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author pjh
 * @Title: SysConfigDaoImpl
 * @Description: 保存配置
 * @date 2020/9/20 17:48
 */
@Service
@Slf4j
public class SysConfigDaoImpl implements ISysConfigDao {


    @Autowired
    IIDGenerate idGenerate;

    @Autowired
    private DSLContext dsl;

    @Override
    public void saveLcHeaderConfRecord(LcHeaderConfRecord lcHeaderConfRecord) {
        if (lcHeaderConfRecord.getId() == null) {
            lcHeaderConfRecord.setId(idGenerate.genId());
            dsl.insertInto(Tables.LC_HEADER_CONF)
                    .set(lcHeaderConfRecord)
                    .execute();
        } else {
            dsl.update(Tables.LC_HEADER_CONF)
                    .set(lcHeaderConfRecord)
                    .execute();
        }

    }

    @Override
    public void delAndRetainSingleLcHeaderConf(Long id) {
        DeleteQuery<LcHeaderConfRecord> lcHeaderConfRecordDeleteQuery = dsl.deleteQuery(Tables.LC_HEADER_CONF);
        if (id != null) {
            Condition eq = DSL.field(LcHeaderConf.LC_HEADER_CONF.ID).ne(id);
            lcHeaderConfRecordDeleteQuery.addConditions(eq);
        }
        lcHeaderConfRecordDeleteQuery.execute();
    }

    @Override
    public void saveLcHomeBannerConfRecord(LcHomeBannerConfRecord lcHomeBannerConfRecord) {

        if (lcHomeBannerConfRecord.getId() == null) {
            lcHomeBannerConfRecord.setId(idGenerate.genId());
            dsl.insertInto(Tables.LC_HOME_BANNER_CONF)
                    .set(lcHomeBannerConfRecord)
                    .execute();
        } else {
            dsl.update(Tables.LC_HOME_BANNER_CONF)
                    .set(lcHomeBannerConfRecord)
                    .execute();
        }
    }

    @Override
    public void saveLcAppModuleConfRecord(LcAppModuleConfRecord lcAppModuleConfRecord) {

        if (lcAppModuleConfRecord.getId() == null) {
            lcAppModuleConfRecord.setId(idGenerate.genId());
            dsl.insertInto(Tables.LC_APP_MODULE_CONF)
                    .set(lcAppModuleConfRecord)
                    .execute();
        } else {
            dsl.update(Tables.LC_APP_MODULE_CONF)
                    .set(lcAppModuleConfRecord)
                    .execute();
        }
    }

    @Override
    public void saveLcInfoBannerConfRecord(LcInfoBannerConfRecord lcInfoBannerConfRecord) {

        if (lcInfoBannerConfRecord.getId() == null) {
            lcInfoBannerConfRecord.setId(idGenerate.genId());
            dsl.insertInto(Tables.LC_INFO_BANNER_CONF)
                    .set(lcInfoBannerConfRecord)
                    .execute();
        } else {
            dsl.update(Tables.LC_INFO_BANNER_CONF)
                    .set(lcInfoBannerConfRecord)
                    .execute();
        }
    }

    @Override
    public void saveLcAppInfoRecord(LcAppInfoRecord lcAppInfoRecord) {

        if (lcAppInfoRecord.getId() == null) {
            lcAppInfoRecord.setId(idGenerate.genId());
            dsl.insertInto(Tables.LC_APP_INFO)
                    .set(lcAppInfoRecord)
                    .execute();
        } else {
            dsl.update(Tables.LC_APP_INFO)
                    .set(lcAppInfoRecord)
                    .execute();
        }
    }

    @Override
    public LcHeaderConfRecord selectLcHeaderConfRecord() {
        return dsl.selectFrom(Tables.LC_HEADER_CONF).fetchAny();
    }

    @Override
    public List<LcHomeBannerConfRecord> selectLcHomeBannerConfRecords() {
        Condition eq = DSL.field(LcHomeBannerConf.LC_HOME_BANNER_CONF.DEL_FLAG).eq((byte) 0);
        return dsl.selectFrom(Tables.LC_HOME_BANNER_CONF)
                .where(eq)
                .orderBy(LcHomeBannerConf.LC_HOME_BANNER_CONF.DISP_OR.asc())
                .fetch();
    }

    @Override
    public List<LcAppModuleConfRecord> selectLcAppModuleConfRecords() {
        Condition eq = DSL.field(LcAppModuleConf.LC_APP_MODULE_CONF.DEL_FLAG).eq((byte) 0);
        return dsl.selectFrom(Tables.LC_APP_MODULE_CONF)
                .where(eq)
                .orderBy(LcAppModuleConf.LC_APP_MODULE_CONF.DISP_OR.asc())
                .fetch();
    }

    @Override
    public List<LcInfoBannerConfRecord> selectLcInfoBannerConfRecords() {
        Condition eq = DSL.field(LcInfoBannerConf.LC_INFO_BANNER_CONF.DEL_FLAG).eq((byte) 0);
        return dsl.selectFrom(Tables.LC_INFO_BANNER_CONF)
                .where(eq)
                .orderBy(LcInfoBannerConf.LC_INFO_BANNER_CONF.DISP_OR.asc())
                .fetch();
    }


}
