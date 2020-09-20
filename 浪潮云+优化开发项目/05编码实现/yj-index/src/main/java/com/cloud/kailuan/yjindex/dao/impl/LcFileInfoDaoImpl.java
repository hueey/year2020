package com.cloud.kailuan.yjindex.dao.impl;

import cn.hutool.core.lang.generator.UUIDGenerator;
import com.cloud.kailuan.yjindex.dao.ILcFileInfoDao;
import com.cloud.kailuan.yjindex.db.Tables;
import com.cloud.kailuan.yjindex.db.tables.LcFileInfo;
import com.cloud.kailuan.yjindex.db.tables.records.LcFileInfoRecord;
import com.cloud.kailuan.yjindex.entity.LcFileInfoEntity;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author pjh
 * @Title: LcFileInfoDaoImpl
 * @Description: LcFileInfo处理
 * @date 2020/9/20 11:35
 */
@Repository
@Slf4j
public class LcFileInfoDaoImpl implements ILcFileInfoDao {

    @Autowired
    private DSLContext dsl;

    @Override
    public void save(LcFileInfoRecord lcFileInfoRecord) {

      dsl.insertInto(Tables.LC_FILE_INFO)
              .set( lcFileInfoRecord )
              .execute();
    }
}
