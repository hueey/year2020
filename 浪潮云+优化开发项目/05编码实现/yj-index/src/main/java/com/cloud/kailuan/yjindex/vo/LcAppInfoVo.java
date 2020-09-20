package com.cloud.kailuan.yjindex.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

/**
 * @author pjh
 * @Title: LcAppInfoVo
 * @Description: 安装表相关信息
 * @date 2020/9/20 16:34
 */
@ApiModel(value = "安装包信息")
@Data
public class LcAppInfoVo {

    @ApiModelProperty(value = "主键",  required = false)
    private Long          id;

    @ApiModelProperty(value = "app名字", required = false)
    private String        appName;

    @ApiModelProperty(value = "app平台", required = false)
    private String        platformType;

    @ApiModelProperty(value = "app版本", required = false)
    private String        appVersion;

    @ApiModelProperty(value = "app信息", required = false)
    private String        versionInfo;

    @ApiModelProperty(value = "app下载地址", required = false)
    private String        appUrl;

    @ApiModelProperty(value = "备注", required = false)
    private String        remark;

    @ApiModelProperty(value = "删除标记", required = false)
    private Integer       delFlag;
//    private String        createBy;
//    private LocalDateTime createDate;
//    private String        updateBy;
//    private LocalDateTime updateDate;
}
