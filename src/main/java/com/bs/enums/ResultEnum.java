package com.bs.enums;

/**
 * Created by kylin on 2018/2/25.
 */
public enum ResultEnum {
    UNKONW_ERROR(-1, "未知错误"),
    SUCCESS(200,"成功"),
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg){
        this.code  = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
