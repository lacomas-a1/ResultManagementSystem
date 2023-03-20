package com.system.Management.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.Management.Model.Exam;
import com.system.Management.Repository.ExamRepository;
import com.system.Management.Service.ExamService;

@Service
public class ExamServiceImpl implements ExamService {
	
	@Autowired
	private ExamRepository examRepository;

	@Override
	public List<Exam> getAllExams() {
		// TODO Auto-generated method stub
		return examRepository.findAll();
	}

	@Override
	public void saveExam(Exam exam) {
		// TODO Auto-generated method stub
		this.examRepository.save(exam);
		
	}

	@Override
	public Exam getExamById(long id) {
		Optional<Exam> optional = examRepository.findById(id);
		Exam exam = null;
		if(optional.isPresent()) {
			exam = optional.get();
		}else {
			throw new RuntimeException("Exam not found for id::" +id);
		}
		return exam;
	}

	@Override
	public void deleteExamById(long id) {
		// TODO Auto-generated method stub
		this.examRepository.deleteById(id);
		
	}

}
