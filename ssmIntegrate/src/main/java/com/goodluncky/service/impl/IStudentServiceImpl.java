package com.goodluncky.service.impl;

import com.goodluncky.mapper.IStudentDao;
import com.goodluncky.domain.Student;
import com.goodluncky.service.IStudentService;

public class IStudentServiceImpl implements IStudentService {
    private IStudentDao dao;
    public void setDao(IStudentDao dao){
        this.dao=dao;
    }
    @Override
    public void addStudent(Student student) {
        dao.insertStudent(student);
    }
}
