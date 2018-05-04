package com.alex.DAO;

import com.alex.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDAO {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "John", "Course 1"));
                put(2, new Student(2, "Frank", "Course 2"));
                put(3, new Student(3, "Mike", "Course 3"));
                put(4, new Student(4, "Rick", "Course 4"));
            }
        };
    }


    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

    public Student getStudentByID(int id) {
        return this.students.get(id);
    }

    public void removeStudentByID(int id) {
        this.students.remove(id);
    }

    public void updateStudent(Student student) {
        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getId(), student);
    }

    public void insertStudent(Student student) {
        this.students.put(student.getId(), student);
    }
}
