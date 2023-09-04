package com.mongo.example.controller;


import com.mongo.example.models.Student;
import com.mongo.example.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/student")
public class StudentController
{
    @Autowired
    private StudentRepository studentRepository;


    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student student)
    {
        this.studentRepository.save(student);

        return ResponseEntity.status(HttpStatus.CREATED).body(student);

        // return ResponseEntity.ok(student);

    }




    @GetMapping("/")
    public ResponseEntity<?> getStudents()
    {
        return ResponseEntity.ok(this.studentRepository.findAll());

    }

}
