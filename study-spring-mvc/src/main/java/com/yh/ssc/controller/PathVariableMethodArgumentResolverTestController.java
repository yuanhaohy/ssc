package com.yh.ssc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by yuanhaohy on 2017/11/30.
 */
@Controller
public class PathVariableMethodArgumentResolverTestController {

    @RequestMapping(value = "pathvariable/{id}-{xx}")
    protected String handleRequest(@PathVariable(name = "xx") int id) throws Exception {

        System.out.println(id);

        return "demo";
    }

}
