package com.system.Management.Service;

import java.util.List;

import com.system.Management.Model.Student;

public interface StudentService {
	List<Student> getAllStudents();
    void saveStudent(Student student);
    Student getStudentById(long id);
    void deleteStudentById(long id);
    Long countStudents();
}
