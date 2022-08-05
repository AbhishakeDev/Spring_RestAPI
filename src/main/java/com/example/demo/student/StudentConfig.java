package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student a = new Student( "Mariam", LocalDate.of(2000, Month.JANUARY, 15),  "abc@gmail.com");
            Student b = new Student( "Abhishek", LocalDate.of(2000, Month.JANUARY, 15),"akbc@gmail.com");
            Student c = new Student( "ABD", LocalDate.of(2000, Month.JANUARY, 15),"abscsc@gmail.com");
            Student d = new Student( "YELL", LocalDate.of(2000, Month.JANUARY, 15),"abasac@gmail.com");
            Student e = new Student( "MOSH", LocalDate.of(2000, Month.JANUARY, 15),"abcqwqwq@gmail.com");
            repository.saveAll(List.of(a,b,c,d,e));
        };
    }
}
