package com.yh.ssc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by yuanhaohy on 2017/11/11.
 */
@Controller
public class DemoController {

    @RequestMapping(value = "/demo")
    protected String handleRequest() throws Exception {
        return "demo";
    }
}
