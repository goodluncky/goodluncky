package com.goodluncky.controller;

import com.goodluncky.service.IStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;

public class StudentController implements Controller {
   private IStudentService service;

   public void setService(IStudentService service){
       this.service = service;
   }

   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){

       return null;
   }

    @Override
    public String value() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
