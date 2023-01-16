package com.antra.restapi001.repository;

import com.antra.restapi001.bean.Teacher;

import java.util.List;

public interface TeacherRepository {

    List<Teacher> getAll();

    Teacher getById(int id);

    void save(Teacher teacher);

    void delete(int id);

}
