package com.cloud.kailuan.yjindex.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author pjh
 * @Title: LcHeaderConfVo
 * @Description: 头部配置
 * @date 2020/9/20 14:14
 */
@Data
@ApiModel(value="头部配置视图对象")
public class LcHeaderConfVo {

    @ApiModelProperty(value="自增主键",dataType="Long",required=false)
    private Long          id;
    @ApiModelProperty(value="头部名称",dataType="String",required=false)
    private String        headerName;
    @ApiModelProperty(value="背景rgb色",dataType="String",required=false)
    private String        rgbColor;
    @ApiModelProperty(value="logo文件路径",dataType="String",required=false)
    private String        logoFileUrl;
    @ApiModelProperty(value="背景图片地址",dataType="String",required=false)
    private String        bgFileUrl;
    @ApiModelProperty(value="自增主键",dataType="String",required=false)
    private String        status;

}
