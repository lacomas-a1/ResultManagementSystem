package com.system.Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.Management.Model.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long>{
	long count();
}
