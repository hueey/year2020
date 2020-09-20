package com.cloud.kailuan.yjindex.controller;

import com.cloud.kailuan.yjindex.base.R;
import com.cloud.kailuan.yjindex.service.ISysConfigService;
import com.cloud.kailuan.yjindex.vo.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
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


    @Autowired
    ISysConfigService sysConfigService;

    //保存头部
    @ApiOperation(value="保存首页配置")
    @PostMapping("/saveHomeConfig")
    @ResponseBody
    public R<LcHomeConfigVo> saveHomeConfig(@RequestBody LcHomeConfigVo lcHomeConfigVo) {
        sysConfigService.saveHomeConfig( lcHomeConfigVo.getLcHeaderConfVo(),
                lcHomeConfigVo.getLcHomeBannerConfVos(),
                lcHomeConfigVo.getLcAppModuleConfVos(),
                lcHomeConfigVo.getLcInfoBannerConfVos() );
        return R.ok( lcHomeConfigVo );
    }

    //保存安装包
    @ApiOperation(value="保存首页配置")
    @PostMapping("/saveInstallPackageInfo")
    @ResponseBody
    public R<LcAppInfoVo> saveInstallPackage( LcAppInfoVo lcAppInfoVo ) {
        sysConfigService.saveInstallPackage( lcAppInfoVo );
        return R.ok(  );
    }

    //保存安装包
    @ApiOperation(value="获取安装包配置信息")
    @GetMapping("/getInstallPackageInfos")
    @ResponseBody
    public R<List<LcAppInfoVo>> getInstallPackageInfos( ) {
        List<LcAppInfoVo> installPackageInfos = sysConfigService.getInstallPackageInfos();
        return R.ok( installPackageInfos );
    }


    @ApiOperation(value="获取首页信息")
    @GetMapping("/getHomeConfig")
    @ResponseBody
    public R<LcHomeConfigVo> getHomeConfig( ) {
        LcHomeConfigVo lcHomeConfigVo = sysConfigService.findHomeConfig( );
        return R.ok( lcHomeConfigVo );
    }







}
