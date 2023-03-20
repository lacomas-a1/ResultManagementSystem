package com.system.Management.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.Management.Model.Result;
import com.system.Management.Repository.ResultRepository;
import com.system.Management.Service.ResultService;

@Service
public class ResultServiceImpl implements ResultService{
	
	@Autowired
	private ResultRepository resultRepository;

	@Override
	public List<Result> getAllResults() {
		return resultRepository.findAll();
	}

	@Override
	public void saveResult(Result result) {
		this.resultRepository.save(result);
		
	}

	@Override
	public Result getResultById(long id) {
		Optional<Result> optional = resultRepository.findById(id);
		Result result = null;
		if(optional.isPresent()) {
			result = optional.get();
		}else {
			throw new RuntimeException("Result not found for id::" +id);
		}
		return result;
	}

	@Override
	public void deleteResultById(long id) {
		this.resultRepository.deleteById(id);
		
	}

}
