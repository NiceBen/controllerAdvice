package com.ofben.controllerAdvice.constant;

import lombok.Data;

import static com.ofben.controllerAdvice.constant.ResultEnum.SUCCESS;

/**
 * TODO
 *
 * @author NiceBen
 * @date 2021-12-31
 * @since TODO
 */
@Data
public class Result<T> {

    private int code;

    private String message;

    private T data;

    private Result() {
    }

    private Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 成功
     */
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setCode(SUCCESS.getCode());
        result.setMessage(SUCCESS.getMessage());
        result.setData(data);
        return result;
    }

    /**
     * 失败
     */
    public static <T> Result<T> error(int code, String message) {
        return new Result<>(code, message);
    }
}
