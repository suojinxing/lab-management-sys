package com.lc.labmanagementsys.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JsonResult implements Serializable {
    private static final long serialVersionUID = 1L;
    /**状态码*/

    private int state = ResultState.SUCCESS;// 1表示SUCCESS,0表示ERROR
    /**状态信息*/
    private String message = "ok";
    /**正确数据*/
    private Object obj;

    public JsonResult(String message) {
        this.message = message;
    }

    /**一般查询时调用，封装查询结果*/
    public JsonResult(String message, Object obj) {
        this(message);
        this.obj = obj;
    }

    /**出现异常时时调用*/
    public JsonResult(Throwable t) {
        this.state = 0;
        this.message = t.getMessage();
    }
}
