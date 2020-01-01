package com.lc.labmanagementsys.exception;

import com.lc.labmanagementsys.common.JsonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

// 该注解描述的类表示异常处理类
@ControllerAdvice
// @RestControllerAdvice
// @RestController
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(RuntimeException.class) // 标明能够处理什么类型的异常
    public JsonResult doHandlerRuntimeException(RuntimeException e) {
        e.printStackTrace();
        return new JsonResult(e);
    }
}
