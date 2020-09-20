package com.cloud.kailuan.yjindex.dao;

import com.cloud.kailuan.yjindex.db.tables.LcFileInfo;
import com.cloud.kailuan.yjindex.db.tables.records.LcFileInfoRecord;

public interface ILcFileInfoDao {
    void save(LcFileInfo lcFileInfo);
}
