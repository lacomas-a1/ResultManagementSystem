package com.system.Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.Management.Model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
	long count();

}
