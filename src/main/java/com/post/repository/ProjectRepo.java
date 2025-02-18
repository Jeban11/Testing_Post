package com.post.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.post.entity.Project;

public interface ProjectRepo extends CrudRepository<Project, Long> { 

	@Query(value = "select * FROM tbl_project where department_id=?", nativeQuery = true) 

	public List<Project> findProjectByDepartment(long departmentId); 

  

} 
