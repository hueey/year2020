package com.cloud.kailuan.yjindex.service;

import com.cloud.kailuan.yjindex.vo.*;

import java.util.List;

public interface ISysConfigService {
    LcHomeConfigVo saveHomeConfig(LcHeaderConfVo lcHeaderConfVo, List<LcHomeBannerConfVo> lcHomeBannerConfVos, List<LcAppModuleConfVo> lcAppModuleConfVos, List<LcInfoBannerConfVo> lcInfoBannerConfVos);

    LcHomeConfigVo findHomeConfig();

    void saveInstallPackage( LcAppInfoVo lcAppInfoVo );

    List<LcAppInfoVo> getInstallPackageInfos();
}
