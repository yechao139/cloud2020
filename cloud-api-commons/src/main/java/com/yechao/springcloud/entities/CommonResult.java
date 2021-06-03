package com.yechao.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ：yechao
 * @date ：Created in 2021/1/8 8:47
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{
    private Integer code;
    private String message;
    private T data;
    public CommonResult(Integer code,String message) {
        this(code,message,null);
    }
}
