package com.practise.practise1.service;

import com.practise.practise1.model.Student;
import com.practise.practise1.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

import static java.lang.Object.*;

@Service
public class StudentService {

    @Autowired
    Repository repository;


    public List<Student> readData() {
        return repository.findAll();
    }

    public void postData(Student student) {
        repository.save(student);
    }


//    public List<Student> postMany(List<Student> studentList) {
//        List<Student> response = repository.saveAll(studentList);
//        return response;

//     List<Student> std = new ArrayList<>();
//     for(int i=0;i <std;i++)
//     {
//         std.add(new Student(student));
//     }

    public List<Student> postMany(List<Student> studentList){
        List<Student> s = repository.saveAll(studentList);
        return s;
    }

    public Student getOne(int id) {

            Student s = repository.findById(id).get();
            return s;

    }

    public String delete(Student id){
         repository.delete(id);
         return "Deleted";
    }

    public Student update(Student student, int id) {
        Student s;
        s=repository.findById(id).get();

        if(Objects.nonNull(student.getFirst_Name()) && !"".equalsIgnoreCase(
                student.getFirst_Name())){
            s.setFirst_Name(
                    student.getFirst_Name()
            );
        }

        if(Objects.nonNull(student.getLast_Name()) && !"".equalsIgnoreCase(
                student.getLast_Name())){
            s.setLast_Name(
                    student.getLast_Name()
            );

        }

      if(Objects.nonNull(student.getYear()) && !"".equalsIgnoreCase(
              String.valueOf(student.getYear()))){
          s.setYear(student.getYear());
      }

      if(Objects.nonNull(student.getSem()) && !"".equalsIgnoreCase(
              String.valueOf(student.getSem()))){
          s.setSem(
                  student.getSem()

          );
      }

      if(Objects.nonNull(student.getDepartment()) && !"".equalsIgnoreCase(student.getDepartment())){
          s.setDepartment(student.getDepartment());
        }

        if (Objects.nonNull(student.getArrear()) && !"".equalsIgnoreCase(String.valueOf(student.getArrear()))
        ) {

            s.setArrear(student.getArrear());
        }

        if (Objects.nonNull(student.getCgpa()) && !"".equalsIgnoreCase(String.valueOf(student.getCgpa())))
         {

            s.setCgpa(Float.parseFloat(String.valueOf(student.getCgpa())));
        }

        return repository.save(s);

    }
}

