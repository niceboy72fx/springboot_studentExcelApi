package com.example.Student.studentRespositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Student.studentModels.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface studentRespositories extends  JpaRepository<Student,Long>{
     Optional<Student> findStudent (String s);
     @Query ("select * from Student where Student.name = :name")
     Iterable<Student>  findStudentByName(@Param("name") String name);
     @Query ("select * from Student where Student.IdStudent = :IdStudent")
     Iterable<Student> findStudentById(@Param("IdStudent") String IdStudent);
}



