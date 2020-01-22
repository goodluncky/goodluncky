package com.goodluncky.utils;

public class StringUtils {
    public void test(){
        org.springframework.util.StringUtils.isEmpty("a");

    }
    public static boolean isEmpty(Object str){
        return (str == null || "".equals(str));
    }
}
