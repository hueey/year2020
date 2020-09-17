package com.cloud.kailuan.yjindex.handler;

import com.cloud.kailuan.yjindex.base.BusinessException;
import com.cloud.kailuan.yjindex.base.R;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

/**
 * TODO 全局异常捕获类
 *
 * @author yzp
 * @date 2020/4/13 0013 8:34
 */
@Log4j2
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 全局异常捕获
     *
     * @param e
     * @return com.dragon.cloud.common.base.R
     * @author yzp
     * @date 2020/8/2 7:35
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public R exception(Exception e) {
        e.printStackTrace();
        return R.fail();
    }

    /**
     * 参数校验失败
     *
     * @param e
     * @return com.dragon.cloud.common.base.R
     * @author yzp
     * @date 2020/8/2 7:35
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public R methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        e.printStackTrace();
        //获取异常中随机一个异常信息
        String defaultMessage = e.getBindingResult().getFieldError().getDefaultMessage();
        return R.fail(defaultMessage);
    }

    /**
     * 参数绑定失败
     *
     * @param e
     * @return com.dragon.cloud.common.base.R
     * @author yzp
     * @date 2020/8/2 7:34
     */
    @ExceptionHandler(BindException.class)
    public R bindExceptionHandler(BindException e) {
        e.printStackTrace();
        //获取异常中随机一个异常信息
        String defaultMessage = e.getBindingResult().getFieldError().getDefaultMessage();
        return R.fail(defaultMessage);
    }

    /**
     * 参数校验失败
     *
     * @param e
     * @return com.dragon.cloud.common.base.R
     * @author yzp
     * @date 2020/8/2 7:34
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public R constraintViolationExceptionHandler(ConstraintViolationException e) {
        e.printStackTrace();
        //获取异常中第一个错误信息
        String message = e.getConstraintViolations().iterator().next().getMessage();
        return R.fail(message);
    }

    /**
     * 处理自定义异常，取message信息返回给前端
     *
     * @param e
     * @return com.dragon.cloud.common.base.R
     * @author yzp
     * @date 2020/8/2 7:33
     */
    @ExceptionHandler(BusinessException.class)
    public R bExceptionHandler(BusinessException e) {
        return R.fail(e.getMessage());
    }

}