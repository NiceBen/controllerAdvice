package com.ofben.controllerAdvice.constant;

/**
 * TODO
 *
 * @author NiceBen
 * @date 2021-12-31
 * @since TODO
 */
public enum ResultEnum {

    SUCCESS(0, "成功"),
    FAIL(-1, "失败"),
    AUTH_ERROR(502, "授权失败"),
    SERVER_BUSY(503, "服务器正忙"),
    DATABASE_OPERATION_FAILED(504, "数据库操作失败");

    private int code;
    private String message;

    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
