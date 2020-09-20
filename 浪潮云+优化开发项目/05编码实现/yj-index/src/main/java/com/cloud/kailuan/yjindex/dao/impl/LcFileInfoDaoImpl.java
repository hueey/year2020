package com.cloud.kailuan.yjindex.dao.impl;

import cn.hutool.core.lang.generator.UUIDGenerator;
import com.cloud.kailuan.yjindex.dao.ILcFileInfoDao;
import com.cloud.kailuan.yjindex.db.Tables;
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
    @Autowired

    @Override
    public void save(LcFileInfoEntity lcFileInfoEntity) {
      dsl.insertInto(Tables.LC_FILE_INFO)
              .columns(
                      Tables.LC_FILE_INFO.ID,
                      Tables.LC_FILE_INFO.BIZ_MODULE_TYPE
                      )
              .values(
                      new DefaultIdentifierGenerator().nextId(null),
                      lcFileInfoEntity.getBizModuleType()
              ).execute();
    }
}
