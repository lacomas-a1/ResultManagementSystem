package com.system.Management.Service;

import java.util.List;

import com.system.Management.Model.Exam;

public interface ExamService {
	List<Exam> getAllExams();
    void saveExam(Exam exam);
    Exam getExamById(long id);
    void deleteExamById(long id);

}
