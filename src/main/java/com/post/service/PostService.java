package com.post.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.post.entity.Department;
import com.post.entity.Post;
import com.post.entity.PostDTO;
import com.post.entity.Project;
import com.post.entity.Region;
import com.post.repository.DepartmentRepo;
import com.post.repository.PostRepo;
import com.post.repository.ProjectRepo;
import com.post.repository.RegionRepo;

@Service
public class PostService {

	@Autowired
	PostRepo postrepo;

	@Autowired
	RegionRepo rgRepo;

	@Autowired
	Post post;

	@Autowired
	Region region;
	
	@Autowired
	Department department;

	@Autowired
	Project project;
	
	@Autowired
	DepartmentRepo dtRepo;

	@Autowired
	ProjectRepo ptRepo;
	

//	public boolean addPost(PostDTO postdto) {
//
//		post.setPostId(postrepo.count() + 1);
//		post.setPostContent(postdto.getPostContent());
//		post.setDateTime(postdto.getDateTime());
//		
//		region = rgRepo.findById(postdto.getRegion()).get();
//		post.setRegion(region);
//		
//		department = dtRepo.findById(postdto.getDepartment()).get();
//		post.setDepartment(department);
//		
//		project = ptRepo.findById(postdto.getProject()).get();
//		post.setProject(project);
//		
//		post.setStatus(true);
//		postrepo.save(post);
//		return true;
//	}
	
	
	public boolean addPost(PostDTO postdto) throws Exception {
		  Long nextPostId = postrepo.count() + 1; 
		 
		  
		  if (postdto.getPostContent() == null || postdto.getPostContent().isEmpty()) {
		    throw new IllegalArgumentException("Post content cannot be null or empty");
		  }
		  
		 
		  Post post = new Post();
		  post.setPostId(nextPostId);
		  post.setPostContent(postdto.getPostContent());
		  post.setDateTime(postdto.getDateTime());

		  
		  Optional<Region> optionalRegion = rgRepo.findById(postdto.getRegion());
		  if (optionalRegion.isPresent()) {
		    post.setRegion(optionalRegion.get());
		  } else {
			    throw new Exception("Region with ID " + postdto.getRegion() + " not found");

		  }
		 
		  Optional<Department> optionalDepartment = dtRepo.findById(postdto.getDepartment());
		  if (optionalDepartment.isPresent()) {
		    post.setDepartment(optionalDepartment.get());
		  } else {
		    throw new Exception("Department with ID " + postdto.getDepartment() + " not found");
		  }
		 
		
		  Optional<Project> optionalProject = ptRepo.findById(postdto.getProject());
		  if (optionalProject.isPresent()) {
		    post.setProject(optionalProject.get());
		  } else {
		    throw new Exception("Project with ID " + postdto.getProject() + " not found");
		  }
		 
		  post.setStatus(true);
		  postrepo.save(post);
		  return true;
		}
	
	
	public boolean insertpost(Post post) {
		postrepo.save(post);
		return true;
	}

	public boolean updatepost(Post post) {
		postrepo.save(post);
		return true;
	}

	public List<Post> getAllPost(){
		Iterator<Post> it = postrepo.findLatestPosts().iterator();
		ArrayList<Post> list = new ArrayList<>();
		
		while(it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
}

