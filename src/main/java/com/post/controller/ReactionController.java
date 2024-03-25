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

import com.post.entity.Reactions;
import com.post.service.ReactionService;

@RestController
@CrossOrigin("http://localhost:4200/") 
public class ReactionController {
	
	@Autowired
	ReactionService reactionService;

	@PostMapping("/reaction")
	public boolean performInsert(@RequestBody Reactions reaction) {
		reactionService.addPost(reaction);
		return true;
	}

	@PutMapping("/reaction")
	public boolean performUpdate(@RequestBody Reactions reaction) {
		reactionService.updatePost(reaction);
		return true;
	}

	@DeleteMapping("/reaction/{reactionId}")
	public void performDelete(@RequestBody long reactionId) {
		reactionService.deletePost(reactionId);

	}

	@GetMapping("/reaction")
	public List<Reactions> viewAllReactionsDetails() {
		return reactionService.getAllReactionDetails();

	}

}
