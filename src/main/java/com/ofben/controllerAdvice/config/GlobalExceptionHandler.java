package com.ofben.controllerAdvice.config;

import com.ofben.controllerAdvice.constant.Result;
import com.ofben.controllerAdvice.constant.ResultEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.naming.AuthenticationException;
import javax.security.auth.message.AuthException;

/**
 * TODO
 *
 * @author NiceBen
 * @date 2021-12-31
 * @since TODO
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AuthException.class)
    public String ErrorHandler(AuthenticationException e) {
        log.error("没有通过权限验证!", e);
        return "没有通过权限验证!";
    }

    @ExceptionHandler(Exception.class)
    public Result Exception(Exception e) {
        log.error("未知异常！", e);
        return Result.error(ResultEnum.SERVER_BUSY.getCode(), ResultEnum.SERVER_BUSY.getMessage());
    }
}
