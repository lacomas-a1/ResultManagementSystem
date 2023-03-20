package com.system.Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.Management.Model.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {

}
