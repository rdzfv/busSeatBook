package com.BUS.error;

public interface CommonError {
    public int getErrorCode();
    public String getErrorMsg();
    public CommonError setErrMsg(String errMsg);
}
