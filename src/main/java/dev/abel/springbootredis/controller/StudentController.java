package dev.abel.springbootredis.controller;

import dev.abel.springbootredis.domain.Student;
import dev.abel.springbootredis.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class StudentController {
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @GetMapping("/Inicio")
    public String inicio() {

        //Comentario Inicial desde Local
        return  "{var1 : 1, var2:2, var3:3}";


        }
    @GetMapping("/students")
    public Map<String, Student> findAll() {
        return studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    public Student findById(@PathVariable String id) {
        return studentRepository.findById(id);
    }

    @PostMapping("/students")
    public void createStudent(@RequestBody Student student) {
        studentRepository.save(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable String id) {
        studentRepository.delete(id);
    }
}
