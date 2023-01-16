package com.antra.restapi001.service.impl;

import com.antra.restapi001.bean.Teacher;
import com.antra.restapi001.repository.TeacherRepository;
import com.antra.restapi001.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    @Qualifier("teacherRepositoryImpl")
    private TeacherRepository teacherRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Teacher> getAll() {
        return teacherRepository.getAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Teacher getById(int id) {
        return teacherRepository.getById(id);
    }

    @Override
    @Transactional
    public void save(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    @Transactional
    public void delete(int id) {
        teacherRepository.delete(id);
    }
}
