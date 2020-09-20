package com.cloud.kailuan.yjindex.vo;

import lombok.Data;

/**
 * @author pjh
 * @Title: LcFileInfoVo
 * @Description: 文件上传返回对象
 * @date 2020/9/20 11:37
 */
@Data
public class LcFileInfoUploadVo {

    private long id;

    //文件编号，规则是业务类型+随便编号
    private String fileNo;

    //业务模块类型
    private String bizModuleType;

    //文件原始名字
    private String originalName;

    //文件随机名称
    private String newName;

    //文件相对路径，域名+此字段为该资源的请求地址
    private String relativePath;

}
