package org.acme.rest.json;

public class FailMsg {

    private final String msg;

    public FailMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}
