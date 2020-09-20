package com.cloud.kailuan.yjindex.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author pjh
 * @Title: LcFileInfoVo
 * @Description: 文件上传返回对象
 * @date 2020/9/20 11:37
 */
@ApiModel(value = "应用模块配置对象")
@Data
public class LcFileInfoUploadVo {

    @ApiModelProperty(value="主键",dataType="Long",required=false)
    private long id;

    @ApiModelProperty(value="文件编号，规则是业务类型+随便编号",dataType="String",required=false)
    private String fileNo;

    @ApiModelProperty(value="业务模块类型",dataType="String",required=false)
    private String bizModuleType;

    @ApiModelProperty(value="文件原始名字",dataType="String",required=false)
    private String originalName;

    @ApiModelProperty(value="文件随机名称",dataType="String",required=false)
    private String newName;

    @ApiModelProperty(value="文件相对路径，域名+此字段为该资源的请求地址",dataType="String",required=false)
    private String relativePath;

}
