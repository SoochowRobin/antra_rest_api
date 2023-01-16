package com.antra.restapi001.repository;

import com.antra.restapi001.bean.Student;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository {

    List<Student> getAll();

    Student get(int id);

    void save(Student student);

    void delete(int id);
}
