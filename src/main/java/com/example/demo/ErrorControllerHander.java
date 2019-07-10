package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@ControllerAdvice
public class ErrorControllerHander {

    public static final String ERROR = "cuowu";

//    @ExceptionHandler(value = Exception.class) //定义捕获异常类型
    public Object ErrorHander(HttpServletRequest request, HttpServletResponse response, Exception e
    ) {
        e.printStackTrace();//打印异常信息
        ModelAndView modelAndView = new ModelAndView(); //创建 模型 接收
        modelAndView.addObject("exception", e);
        modelAndView.addObject("url", request.getRequestURL());
        modelAndView.setViewName(ERROR);
        return modelAndView;
    }




}
