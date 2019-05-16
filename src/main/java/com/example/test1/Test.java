package com.example.test1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunwx
 * @description:
 * @date 2019/5/1414:48
 */
@RestController
public class Test {

    @RequestMapping("/index")
    public String index(){
        return "测试修改3";
    }
}
