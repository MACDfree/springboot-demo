package me.macd.springbootdemo.exception;

import me.macd.springbootdemo.controller.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    public Result defaultErrorHandler(Exception e) {
        logger.error("全局异常默认捕获", e);
        return Result.error(5000, e.getMessage());
    }
}
