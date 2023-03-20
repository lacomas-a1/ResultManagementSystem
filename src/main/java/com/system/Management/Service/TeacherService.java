package com.system.Management.Service;

import java.util.List;

import com.system.Management.Model.Teacher;

public interface TeacherService {
	List<Teacher> getAllTeachers();
    void saveTeacher(Teacher teacher);
    Teacher getTeacherById(long id);
    void deleteTeacherById(long id);

}
