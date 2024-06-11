package com.example.jpastudent23v2.config;

import com.example.jpastudent23v2.model.Student;
import com.example.jpastudent23v2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        s1.setName("Bruce");
        s1.setBornDate(LocalDate.of(2002,7,10));
        s1.setBornTime(LocalTime.of(11,2,3));
        studentRepository.save(s1);

        Student s2 = new Student(); // Create a new Student object
        s2.setName("Viggo");
        s2.setBornDate(s1.getBornDate()); // Assuming Viggo has the same birthdate as Bruce
        s2.setBornTime(s1.getBornTime()); // Assuming Viggo has the same birthtime as Bruce
        studentRepository.save(s2);
        System.out.println(s2);




    }
}
