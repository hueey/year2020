package com.cloud.kailuan.yjindex.service.impl;

import cn.hutool.core.io.FileUtil;
import com.cloud.kailuan.yjindex.base.R;
import com.cloud.kailuan.yjindex.base.util.FileUploadUtil;
import com.cloud.kailuan.yjindex.dao.ILcFileInfoDao;
import com.cloud.kailuan.yjindex.db.tables.LcFileInfo;
import com.cloud.kailuan.yjindex.db.tables.records.LcFileInfoRecord;
import com.cloud.kailuan.yjindex.service.IFileService;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author pjh
 * @Title: FileServiceImpl
 * @Description: 文件服务
 * @date 2020/9/20 9:50
 */
@Service
@Slf4j
public class FileServiceImpl implements IFileService {


    @Value("${file-server.dir}")
    private String fileDirPath;

    @Autowired
    ILcFileInfoDao lcFileInfoDao;

    @Override
    public LcFileInfoRecord upload(String bizModuleType, MultipartFile file) {
        String fileName = file.getOriginalFilename();
        String filePath = FileUploadUtil.makePath(fileName, fileDirPath);
        String newFileName = FileUploadUtil.makeFilename( fileName );
        File mkdir = FileUtil.mkdir(filePath);
        File dest = new File( mkdir, newFileName );
        try {
            file.transferTo(dest);
            log.info("上传成功");
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }

        LcFileInfoRecord record = new LcFileInfoRecord();
        record.setRelativePath( filePath+"/"+newFileName );
        record.setBizModuleType( bizModuleType );

//        lcFileInfoDao.save( lcFileInfo );

        return record;

    }


}
