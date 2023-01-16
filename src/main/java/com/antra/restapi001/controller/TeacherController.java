package com.antra.restapi001.controller;

import com.antra.restapi001.bean.Teacher;
import com.antra.restapi001.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    @Qualifier("teacherServiceImpl")
    private TeacherService teacherService;

    @GetMapping("/all")
    public List<Teacher> getAll(){
        return teacherService.getAll();
    }

    @GetMapping("/get/{id}")
    public Teacher getById(@PathVariable int id){
        return teacherService.getById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Teacher teacher){
        teacherService.save(teacher);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id){
        teacherService.delete(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Teacher teacher){
        teacherService.save(teacher);
    }


}
