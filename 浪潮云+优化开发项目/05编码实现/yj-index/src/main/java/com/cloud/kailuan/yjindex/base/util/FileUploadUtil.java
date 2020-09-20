package com.cloud.kailuan.yjindex.base.util;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import com.cloud.kailuan.yjindex.base.BusinessException;

/**
 * @author pjh
 * @Title: FileUploadUtil
 * @Description: 文件上传工具类
 * @date 2020/9/20 12:01
 */
public class FileUploadUtil {

    /**
     * 返回构建的二级目录路径
     * @param filename
     * @param basePath
     * @return
     */
    public static String makePath(String filename, String basePath) {
        int hashcode = filename.hashCode();
        int dir1 = hashcode & 0xf;//生成一级目录取哈希码的后4为值范围：0-15
        int dir2 = (hashcode & 0xf0) >> 4;//二级目录  可以根据需要多分级
        String newBasePath = basePath + "/" + dir1 + "/" + dir2+"/";
        return newBasePath;
    }

    /**
     * 返回构建的二级目录路径
     * @param filename
     * @return
     */
    public static String makeSubPath(String filename) {
        int hashcode = filename.hashCode();
        int dir1 = hashcode & 0xf;//生成一级目录取哈希码的后4为值范围：0-15
        int dir2 = (hashcode & 0xf0) >> 4;//二级目录  可以根据需要多分级
        return "/" + dir1 + "/" + dir2 ;
    }


    public static String makeFilename(String filename) {
        if( StrUtil.isBlank( filename ) ){
            throw new BusinessException("文件名不能为空");
        }
        if( filename.contains(".") ){
            String[] split = StrUtil.split(filename, ".");
            return IdUtil.simpleUUID()+"."+ split[split.length-1];
        }else{
            return IdUtil.simpleUUID();
        }
    }

}
