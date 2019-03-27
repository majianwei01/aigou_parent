package com.majianwei.util;

public class AjaxResult {
    private boolean success=true;
    private String msg="操作成功";
    private Object object=null;

    public static AjaxResult me() {
        return new AjaxResult();
    }

    public static void main(String[] args) {

        AjaxResult.me().setSuccess(false).setMsg("操作失败").setObject("nothing");

    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;

    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
