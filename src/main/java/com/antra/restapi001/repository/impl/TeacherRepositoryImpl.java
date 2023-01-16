package com.antra.restapi001.repository.impl;

import com.antra.restapi001.bean.Teacher;
import com.antra.restapi001.exception.ResourceNotFoundException;
import com.antra.restapi001.repository.TeacherRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class TeacherRepositoryImpl implements TeacherRepository {

    @Resource
    private EntityManager entityManager;

    @Override
    public List<Teacher> getAll() {
        Session currSession = entityManager.unwrap(Session.class);
        Query<Teacher> teachers = currSession.createQuery("from Teacher", Teacher.class);
        List<Teacher> resultList = teachers.getResultList();
        return resultList;
    }

    @Override
    public Teacher getById(int id) {
        Session currSession = entityManager.unwrap(Session.class);
        Teacher teacher = currSession.get(Teacher.class, id);
        return teacher;
    }


    @Override
    public void save(Teacher teacher) {
        Session currSession = entityManager.unwrap(Session.class);
        // consider update situation
        currSession.saveOrUpdate(teacher);
    }

    @Override
    public void delete(int id) {
        Session currSession = entityManager.unwrap(Session.class);
        Teacher teacher = currSession.get(Teacher.class, id);
        if(teacher == null){
            throw new ResourceNotFoundException("There is no teacher with id " + id);
        }else{
            currSession.delete(teacher);
        }
    }
}
