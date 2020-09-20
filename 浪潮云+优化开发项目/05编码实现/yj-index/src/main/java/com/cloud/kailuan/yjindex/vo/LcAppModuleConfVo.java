package com.cloud.kailuan.yjindex.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author pjh
 * @Title: LcHomeBannerConfVo
 * @Description: 首页广告轮播图配置
 * @date 2020/9/20 14:29
 */
@ApiModel(value = "应用模块配置对象")
@Data
public class LcAppModuleConfVo {

    @ApiModelProperty(value = "主键", dataType = "Long", required = false)
    private Long id;

    @ApiModelProperty(value = "应用标题", required = false)
    private String title;

    @ApiModelProperty(value = "图标地址", required = false)
    private String icoUrl;

    @ApiModelProperty(value = "图标连接类型", required = false)
    private String icoLinkType;

    @ApiModelProperty(value = "图标连接地址", required = false)
    private String icoLinkUrl;

    @ApiModelProperty(value = "备注", required = false)
    private String remark;

    @ApiModelProperty(value = "状态", required = false)
    private String status;

    @ApiModelProperty(value = "删除标记", required = false)
    private Integer delFlag;
}


