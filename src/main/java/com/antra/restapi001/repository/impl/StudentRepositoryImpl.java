package com.antra.restapi001.repository.impl;

import com.antra.restapi001.bean.Student;
import com.antra.restapi001.repository.StudentRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Student> getAll() {
        Session currSession = entityManager.unwrap(Session.class);
        Query<Student> query = currSession.createQuery("from Student ", Student.class);
        List<Student> list = query.getResultList();
        return list;
    }

    @Override
    public Student get(int id) {
        Session currSession = entityManager.unwrap(Session.class);
        Student student = currSession.get(Student.class, id);
        return student;
    }

    @Override
    public void save(Student student) {
        Session currSession = entityManager.unwrap(Session.class);
        // consider update situation, so use saveOrUpdate
        currSession.saveOrUpdate(student);
    }


    @Override
    public void delete(int id) {
        Session currSession = entityManager.unwrap(Session.class);
        Student student = currSession.get(Student.class, id);
        if(student == null){
            throw new RuntimeException("There is no student with id " + id+" to delete");
        }else{
            currSession.delete(student);
        }
    }
}
