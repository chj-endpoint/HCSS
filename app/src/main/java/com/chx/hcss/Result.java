package com.chx.hcss;

/**
 * Created by win7 on 2018/5/9.
 */

public class Result {
    public boolean isOk() {
        return isOk;
    }

    public void setOk(boolean ok) {
        isOk = ok;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private boolean isOk;
    private String message;
}
