package com.system.Management.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.Management.Model.Teacher;
import com.system.Management.Repository.TeacherRepository;
import com.system.Management.Service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	private TeacherRepository teacherRepository;

	@Override
	public List<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		return teacherRepository.findAll();
	}

	@Override
	public void saveTeacher(Teacher teacher) {
		this.teacherRepository.save(teacher);

	}

	@Override
	public Teacher getTeacherById(long id) {
		// TODO Auto-generated method stub
		Optional<Teacher> optional = teacherRepository.findById(id);
		Teacher teacher = null;
		if (optional.isPresent()) {
			teacher = optional.get();
		} else {
			throw new RuntimeException("Teacher not found for id::" +id);

		}
		return teacher;
	}

	@Override
	public void deleteTeacherById(long id) {
		// TODO Auto-generated method stub
		this.teacherRepository.deleteById(id);

	}

	@Override
	public Long countTeachers() {
		// TODO Auto-generated method stub
		return teacherRepository.count();
	}

	

}
