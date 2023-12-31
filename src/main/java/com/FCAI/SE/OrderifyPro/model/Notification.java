package com.FCAI.SE.OrderifyPro.model;

public class Notification {

    private String msg;
    private String receiver;
    private String template;
    private long time = System.currentTimeMillis();

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMsg() {
        return msg;
    }

    public String getReceiver() {
        return receiver;
    }

    public long getTime() {
        return time;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}
