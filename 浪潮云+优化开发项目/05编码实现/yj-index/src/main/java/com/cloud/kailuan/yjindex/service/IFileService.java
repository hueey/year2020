package com.cloud.kailuan.yjindex.service;

import com.cloud.kailuan.yjindex.db.tables.LcFileInfo;
import com.cloud.kailuan.yjindex.db.tables.records.LcFileInfoRecord;
import org.springframework.web.multipart.MultipartFile;

public interface IFileService {

    LcFileInfoRecord upload(String bizModuleType, MultipartFile file);
}
