package com.antra.restapi001.service;

import com.antra.restapi001.bean.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> getAll();

    Teacher getById(int id);

    void save(Teacher teacher);

    void delete(int id);

}
