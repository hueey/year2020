package com.cloud.kailuan.yjindex.controller;

import com.cloud.kailuan.yjindex.base.R;
import com.cloud.kailuan.yjindex.vo.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author pjh
 * @Title: SysConfigController
 * @Description: 系统配置服务
 * @date 2020/9/20 9:33
 */
@RestController
@Api(tags="系统配置")
@RequestMapping("SysConfig")
public class SysConfigController {



    //保存头部
    @ApiOperation(value="保存首页配置")
    @PostMapping("/saveHomeConfig")
    @ApiImplicitParams({
            @ApiImplicitParam(name="xx",value="xx",required=true,dataType="String",paramType="query")
    })
    @ResponseBody
    public R<LcHomeConfigVo> saveHomeConfig(LcHeaderConfVo lcHeaderConfVo, List<LcHomeBannerConfVo> lcHomeBannerConfVo,
                                            List<LcAppModuleConfVo> lcAppModuleConfVo, List<LcInfoBannerConfVo> lcInfoBannerConfVo) {

        return null;
    }




    //


}
