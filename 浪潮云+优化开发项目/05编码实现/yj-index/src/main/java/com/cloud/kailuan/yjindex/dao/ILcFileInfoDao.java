package com.cloud.kailuan.yjindex.dao;


import com.cloud.kailuan.yjindex.db.tables.records.LcFileInfoRecord;
import com.cloud.kailuan.yjindex.entity.LcFileInfoEntity;

public interface ILcFileInfoDao {
    void save(LcFileInfoRecord lcFileInfoRecord);
}
