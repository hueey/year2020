package com.cloud.kailuan.yjindex.entity;

import lombok.Data;

@Data
public class LcFileInfoEntity {
    private Long id;
    private String fileNo;
    private String bizModuleType;
    private String originalName;
    private String newName;
    private String  filePath;
    private String  relativePath;
    private String  delFlag;
    private String  createBy;
    private String  createDate;
    private String  updateBy;
    private String  updateDate;
    private String  remarks;
}
