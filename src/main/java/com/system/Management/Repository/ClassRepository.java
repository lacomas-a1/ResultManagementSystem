package com.system.Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.Management.Model.Class;

@Repository
public interface ClassRepository extends JpaRepository<Class, Long>{
//	long classCount()
	long count();

}
