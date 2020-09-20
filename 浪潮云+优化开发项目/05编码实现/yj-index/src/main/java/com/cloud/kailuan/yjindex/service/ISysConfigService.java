package com.cloud.kailuan.yjindex.service;

import com.cloud.kailuan.yjindex.vo.*;

import java.util.List;

public interface ISysConfigService {

    LcHomeConfigVo findHomeConfig();

    void saveInstallPackage( LcAppInfoVo lcAppInfoVo );

    List<LcAppInfoVo> getInstallPackageInfos();

    void saveHomeConfig(LcHomeConfigVo lcHomeConfigVo);
}
