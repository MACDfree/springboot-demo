package me.macd.springbootdemo.controller;

import org.springframework.util.StringUtils;

import java.util.HashMap;

public class Result extends HashMap<String, Object> {
    Result() {
    }

    static Result ok(Object data) {
        return ret(2000, "", data);
    }

    static Result ok() {
        return ret(2000, "", null);
    }

    static Result error(Integer code, String msg) {
        return ret(code, msg, null);
    }

    private static Result ret(Integer code, String msg, Object data) {
        Result result = new Result();
        if (code != null) {
            result.put("code", code);
        }
        if (!StringUtils.isEmpty(msg)) {
            result.put("msg", msg);
        }
        if (data != null) {
            result.put("data", data);
        }
        return result;
    }
}
