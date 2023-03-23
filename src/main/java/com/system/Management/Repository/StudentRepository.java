package com.system.Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.Management.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	long count();
}
