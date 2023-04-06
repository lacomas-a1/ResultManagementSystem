package com.system.Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.Management.Model.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long>{

}
