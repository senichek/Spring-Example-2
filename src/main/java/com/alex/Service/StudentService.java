package com.alex.Service;

import com.alex.DAO.StudentDAO;
import com.alex.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public Collection<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    public Student getStudentByID(int id) {
        return studentDAO.getStudentByID(id);
    }

    public void removeStudentbyID(int id) {
        this.studentDAO.removeStudentByID(id);
    }

    public void updateStudent(Student student) {
        studentDAO.updateStudent(student);
    }

    public void insertStudent(Student student) {
        studentDAO.insertStudent(student);
    }
}
