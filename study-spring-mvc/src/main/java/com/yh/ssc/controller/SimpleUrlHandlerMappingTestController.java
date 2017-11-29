package com.yh.ssc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Create by yuanhaohy on 2017/11/29.
 */
public class SimpleUrlHandlerMappingTestController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("demo");
        return modelAndView;
    }

}
