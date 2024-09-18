package org.bytetech.SpringJDBC.service;

import org.bytetech.SpringJDBC.model.Student;
import org.bytetech.SpringJDBC.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    StudentRepo repo;

    public void addStudent(Student student) {
        repo.save(student);
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
