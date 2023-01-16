package com.antra.restapi001.service;

import com.antra.restapi001.bean.Student;

import java.util.List;

public interface StudentService {

    List<Student> get();

    Student get(int id);

    void save(Student student);

    void delete(int id);
}
