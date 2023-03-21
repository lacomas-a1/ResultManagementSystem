package com.system.Management.Service;

import java.util.List;

import com.system.Management.Model.Subject;

public interface SubjectService {
	List<Subject> getAllSubjects();
    void saveSubject(Subject subject);
    Subject getSubjectById(long id);
    void deleteSubjectById(long id);
    long getSubjectCount();
}
