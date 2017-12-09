package com.yh.ssc.mapping;

import org.springframework.beans.BeansException;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import java.util.Map;

/**
 * Create by yuanhaohy on 2017/12/5.
 */
public class SelfHandlerMapping extends SimpleUrlHandlerMapping {

    protected void registerHandlers(Map<String, Object> urlMap) throws BeansException {
        registerHandler("/self", "selfHandlerMappingTestController");
    }

}
