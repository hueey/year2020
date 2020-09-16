package com.cloud.kailuan.yjindex.base;

/**
 * @author yzp
 * @date 2020/8/2 7:15
 */
public class BusinessException extends RuntimeException {
    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
    }

    /**
     * 自定义业务异常，关闭堆栈跟踪
     *
     * @return java.lang.Throwable
     * @author yzp
     * @date 2020/8/2 7:37
     */
    @Override
    public synchronized Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
