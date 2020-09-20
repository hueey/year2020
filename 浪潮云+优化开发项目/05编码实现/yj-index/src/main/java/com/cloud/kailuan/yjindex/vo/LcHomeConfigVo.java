package com.cloud.kailuan.yjindex.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author pjh
 * @Title: HomeConfigVo
 * @Description: 首页配置信息
 * @date 2020/9/20 14:25
 */
@ApiModel(value="首页配置数据")
@Data
public class LcHomeConfigVo {

    @ApiModelProperty(value="头部配置",required=false)
    private LcHeaderConfVo lcHeaderConfVo;

    @ApiModelProperty(value="首页banner配置",required=false)
    private List<LcHomeBannerConfVo> lcHomeBannerConfVos;

    @ApiModelProperty(value="应用配置",required=false)
    private List<LcAppModuleConfVo> lcAppModuleConfVos;

    @ApiModelProperty(value="资讯新闻配置",required=false)
    private List<LcInfoBannerConfVo> lcInfoBannerConfVos;
}
