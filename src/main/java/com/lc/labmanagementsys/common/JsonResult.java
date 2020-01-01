package com.lc.labmanagementsys.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonResult implements Serializable {
    private static final long serialVersionUID = 1L;
    /**状态码*/
    private int state = 1;// 1表示SUCCESS,0表示ERROR
    /**状态信息*/
    private String message = "ok";
    /**正确数据*/
    private Object data;

    public JsonResult(String message) {
        this.message = message;
    }

    /**一般查询时调用，封装查询结果*/
    public JsonResult(String message, Object data) {
        this(message);
        this.data = data;
    }

    /**出现异常时时调用*/
    public JsonResult(Throwable t) {
        this.state = 0;
        this.message = t.getMessage();
    }
}
