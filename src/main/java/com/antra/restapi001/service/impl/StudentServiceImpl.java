package com.antra.restapi001.service.impl;

import com.antra.restapi001.bean.Student;
import com.antra.restapi001.repository.StudentRepository;
import com.antra.restapi001.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    @Qualifier("studentRepositoryImpl")
    private StudentRepository studentRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Student> get() {
        return studentRepository.getAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Student get(int id) {
        return studentRepository.get(id);
    }

    @Override
    @Transactional
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    @Transactional
    public void delete(int id) {
        studentRepository.delete(id);
    }
}
