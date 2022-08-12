package com.atguigu.myzhxy;

import com.atguigu.myzhxy.util.Result;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@SpringBootTest
class MyzhxyApplicationTests {

    @Test
//    @ControllerAdvice
    void contextLoads() {


    }


    @ExceptionHandler
    @ResponseBody
    public Result te(Exception e){
        e.printStackTrace();
       return Result.fail().message("请重试");

    }

}
