package com.cloud.kailuan.yjindex.dao;

import com.cloud.kailuan.yjindex.db.tables.records.*;

import java.util.List;

public interface ISysConfigDao {
    void saveLcHeaderConfRecord(LcHeaderConfRecord lcHeaderConfRecord);

    void delAndRetainSingleLcHeaderConf(Long id);

    void saveLcHomeBannerConfRecord(LcHomeBannerConfRecord lcHomeBannerConfRecord);

    void saveLcAppModuleConfRecord(LcAppModuleConfRecord lcAppModuleConfRecord);

    void saveLcInfoBannerConfRecord(LcInfoBannerConfRecord lcInfoBannerConfRecord);

    void saveLcAppInfoRecord(LcAppInfoRecord lcAppInfoRecord);

    LcHeaderConfRecord selectLcHeaderConfRecord();

    List<LcHomeBannerConfRecord> selectLcHomeBannerConfRecords();

    List<LcAppModuleConfRecord> selectLcAppModuleConfRecords();

    List<LcInfoBannerConfRecord> selectLcInfoBannerConfRecords();

    List<LcAppInfoRecord> selectLcAppInfoRecords();

}
