package com.cloud.kailuan.yjindex.service.impl;

import cn.hutool.core.io.FileUtil;
import com.cloud.kailuan.yjindex.base.BusinessException;
import com.cloud.kailuan.yjindex.base.util.FileUploadUtil;
import com.cloud.kailuan.yjindex.dao.ILcFileInfoDao;
import com.cloud.kailuan.yjindex.db.tables.records.LcFileInfoRecord;
import com.cloud.kailuan.yjindex.service.IFileService;
import com.cloud.kailuan.yjindex.service.IIDGenerateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

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

    @Autowired
    IIDGenerateService idGenerateService;

    @Override
    public LcFileInfoRecord upload(String bizModuleType, MultipartFile file) {
        String fileName = file.getOriginalFilename();
        String subPath = FileUploadUtil.makeSubPath(fileName);
        String newFileName = FileUploadUtil.makeFilename( fileName );
        File mkdir = FileUtil.mkdir(fileDirPath +"/"+ subPath);
        File dest = new File( mkdir, newFileName );
        try {
            file.transferTo(dest);
            log.info("上传成功");
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            throw new BusinessException( e.getMessage() );
        }
        LcFileInfoRecord lcFileInfoRecord = new LcFileInfoRecord();
        lcFileInfoRecord.setId( idGenerateService.genId()  );
        lcFileInfoRecord.setFileNo( bizModuleType +"_" + idGenerateService.genId()  );
        lcFileInfoRecord.setBizModuleType( bizModuleType );
        lcFileInfoRecord.setOriginalName( fileName );
        lcFileInfoRecord.setNewName( newFileName );
        lcFileInfoRecord.setFilePath( dest.getAbsolutePath() );
        lcFileInfoRecord.setRelativePath( subPath +"/"+newFileName );
        lcFileInfoRecord.setDelFlag((byte)1);
        lcFileInfoRecord.setCreateBy("");
        lcFileInfoRecord.setCreateDate(LocalDateTime.now());
        lcFileInfoRecord.setUpdateBy("");
        lcFileInfoRecord.setUpdateDate(LocalDateTime.now());
        lcFileInfoRecord.setRemarks("");
        lcFileInfoDao.save( lcFileInfoRecord );

        return lcFileInfoRecord;

    }


}
