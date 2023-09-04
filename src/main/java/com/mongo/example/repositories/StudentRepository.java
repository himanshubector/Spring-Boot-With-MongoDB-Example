package com.mongo.example.repositories;


import com.mongo.example.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface StudentRepository extends MongoRepository<Student, Integer>
{

}
