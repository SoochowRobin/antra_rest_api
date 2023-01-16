package com.antra.restapi001.controller;

import com.antra.restapi001.bean.Student;
import com.antra.restapi001.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping ("/all")
    public List<Student> getAll(){
        return studentService.get();
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentService.save(student);
    }

    @GetMapping("/get/{id}")
    public Student getById(@PathVariable int id){
        Student student = studentService.get(id);
        if(student == null){
            throw new RuntimeException("There is no student with "+ id);
        }
        return student;
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        studentService.delete(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentService.save(student);
    }

}
