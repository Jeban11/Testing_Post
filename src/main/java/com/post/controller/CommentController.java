package com.post.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.post.entity.Comments;
import com.post.service.CommentService;
@RestController
@CrossOrigin("http://localhost:4200/") 
public class CommentController {

	@Autowired
	CommentService cmService;

	@PostMapping("/comment")
	public boolean performInsert(@RequestBody Comments comment) {
		cmService.addPost(comment);
		return true;
	}

	@PutMapping("/comment")
	public boolean performUpdate(@RequestBody Comments comment) {
		cmService.updatePost(comment);
		return true;
	}

	@DeleteMapping("/comment/{commentId}")
	public void performDelete(@RequestBody long commentId) {
		cmService.deletePost(commentId);

	}

	@GetMapping("/comment")
	public List<Comments> viewAllCommentsDetails() {
		return cmService.getAllOptionDetails();

	}

}
