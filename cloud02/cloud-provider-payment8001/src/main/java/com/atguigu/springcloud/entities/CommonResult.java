package com.atguigu.springcloud.entities;

/**
 * @Author Gao Biao
 * @Date 2020/11/6 21:52
 * @Version 1.0
 */

/**
 * 这是前后端分离，预留的传给前端的json数据
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer id;
    private String message;
    private T      data;

    public CommonResult(Integer code, String message){
        this(code,message,null);
    }


}
