package com.system.Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.Management.Model.Result;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {

}
