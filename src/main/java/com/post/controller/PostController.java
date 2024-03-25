package com.post.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.post.entity.Post;
import com.post.entity.PostDTO;
import com.post.service.PostService;

@RestController
@CrossOrigin("http://localhost:4200/") 
public class PostController {
	
	@Autowired(required=true)
	PostService posts;
	
	@PostMapping("/postInsert")
	public String performInsert(@RequestBody PostDTO postDto) throws Exception {
		posts.addPost(postDto);
		return "post Inserted";
	}
	
	@PostMapping("/insertPost")
	public String performIns(@RequestBody Post post) {
		posts.updatepost(post);
		return "post inseerted";
	}
	
	
	@PutMapping("/post")
	public String performUpdate(@RequestBody Post post) {
		posts.updatepost(post);
		return "post updated";
	}
	

	@GetMapping("/viewAllPost")
	public List<Post> getAllpost(){
           return posts.getAllPost();
		
	}
}

	
	

