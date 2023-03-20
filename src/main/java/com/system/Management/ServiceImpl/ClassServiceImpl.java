package com.system.Management.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.Management.Model.Class;
import com.system.Management.Repository.ClassRepository;
import com.system.Management.Service.ClassService;

@Service
public class ClassServiceImpl implements ClassService {
	
	@Autowired
	private ClassRepository classRepository;

	@Override
	public List<Class> getAllClasses() {
		return classRepository.findAll();
	}

	@Override
	public void saveClass(Class class1) {
		this.classRepository.save(class1);
	}

	@Override
	public Class getClassById(long id) {
		Optional<Class> optional = classRepository.findById(id);
		Class class1 = null;
		if (optional.isPresent()) {
			class1 = optional.get();
		} else {
			throw new RuntimeException("Class not found for id::" +id);

		}
		return class1;
	}

	@Override
	public void deleteClassById(long id) {
		this.classRepository.deleteById(id);
	}

}
