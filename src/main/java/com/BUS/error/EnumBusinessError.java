package com.BUS.error;

public enum EnumBusinessError implements CommonError{
    //通用错误类型10001
    PARAMETER_VALIDATION_ERROR(10001,"参数不合法"),
    //未知错误00002
//    UNKNOWN_ERROR(10002,"未知错误"),

    //20000开头为用户信息相关错误定义
    USER_NOT_EXIST(20001,"用户不存在"),
    PASSWORD_NOT_CONSISTENT(20002,"两次密码不一致"),
    USER_PASSWORD_NOT_FIT(20003,"用户不存在或原始密码错误"),

    //30000开头为上传业务的错误定义
    PATH_NOT_VALID(30001,"路径错误"),
    ;

    private EnumBusinessError(int errCode,String errMsg){
        this.errCode=errCode;
        this.errMsg=errMsg;
    }

    private int errCode;
    private String errMsg;
    @Override
    public int getErrorCode() {
        return this.errCode;
    }

    @Override
    public String getErrorMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg=errMsg;
        return this;
    }
}
