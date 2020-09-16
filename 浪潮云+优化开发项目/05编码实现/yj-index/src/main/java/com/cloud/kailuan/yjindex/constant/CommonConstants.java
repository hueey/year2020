package com.cloud.kailuan.yjindex.constant;

/**
 * TODO 公共枚举类
 *
 * @author yzp
 * @date 2020/4/13 0013 8:34
 */
public enum CommonConstants {
    SUCCESS(1,"操作成功"),
    FAIL(-1,"操作失败");
    private Integer code;
    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    CommonConstants(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
