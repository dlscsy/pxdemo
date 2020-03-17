package com.demo.util;

import java.util.List;

/**
 * @Description:
 * @Author: chenyue
 * @Date: 2020/3/4 12:36
 */
public class ResultUtil {

    private int status;
    private String message;
    private int data;
    private List list;
    private int code;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
