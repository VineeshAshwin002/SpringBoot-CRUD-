package com.practise.practise1.controller;

import com.practise.practise1.model.Student;
import com.practise.practise1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/students")

public class stdController {

    @Autowired
    StudentService service;

    @GetMapping("/read")
    public List<Student> readData(){
        return service.readData();
    }

    @PostMapping("/post")
    public void postData(@RequestBody Student student){
        service.postData(student);
    }

//    @PostMapping("/postMany")
//    public List<Student> postMany(@RequestBody List<Student> studentList){
//        return service.postMany(studentList);
//    }
//

    @PostMapping("/postMany")
    public List<Student> postMany(@RequestBody List<Student> studentList)
    {
        List<Student> s = service.postMany(studentList);
        return s;
    }

    @GetMapping("/getOne/{id}")
    public Student getOne(@PathVariable int id)
    {
        Student s;
        s = service.getOne(id);
        return s;

    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Student id)
    {
        String s;
        s = service.delete(id);
        return "Deleted";
    }

    @PutMapping("/update/{id}")
    public Student update(@PathVariable int id,@RequestBody Student student){

        return service.update(student, id);
        //return "UPDATED";
    }
}
