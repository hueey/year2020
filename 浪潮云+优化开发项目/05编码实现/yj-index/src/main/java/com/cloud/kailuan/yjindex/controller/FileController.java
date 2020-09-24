package com.cloud.kailuan.yjindex.controller;

import com.cloud.kailuan.yjindex.base.R;
import com.cloud.kailuan.yjindex.db.tables.records.LcFileInfoRecord;
import com.cloud.kailuan.yjindex.service.IFileService;
import com.cloud.kailuan.yjindex.vo.LcFileInfoUploadVo;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author pjh
 * @Title: FileController
 * @Description: 文件服务
 * @date 2020/9/20 9:34
 */
@RestController
@Api(tags="文件服务")
@RequestMapping("api/File")
@Slf4j
public class FileController {

    @Autowired
    IFileService fileService;

    @PostMapping("/uploadFile")
    @ResponseBody
    public R upload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return  R.fail("上传失败，请选择文件");
        }
        String bizModuleType = "HC001";
        LcFileInfoRecord upload = fileService.upload(bizModuleType, file);
        LcFileInfoUploadVo LcFileInfoUploadVo = new LcFileInfoUploadVo();
        BeanUtils.copyProperties( upload, LcFileInfoUploadVo );
        return R.ok( LcFileInfoUploadVo );
    }



}
