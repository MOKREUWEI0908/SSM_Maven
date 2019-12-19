package com.mok.bean;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

public class WebUtils {
    public static <T>T getBean(Class<T> clazz){
        WebApplicationContext ioc = ContextLoader.getCurrentWebApplicationContext();
        return ioc.getBean(clazz);
    }
}
