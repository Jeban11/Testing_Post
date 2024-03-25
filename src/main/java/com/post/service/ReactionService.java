package com.post.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.post.entity.Reactions;
import com.post.repository.ReactionsRepo;

@Service
public class ReactionService {
	
	@Autowired
	ReactionsRepo reactionrepo;

	public boolean addPost(Reactions reaction) {
		reactionrepo.save(reaction);
		return true;
	}
	
	public boolean updatePost(Reactions reaction) {
		reactionrepo.save(reaction);
		return true;
	}
	
	public boolean deletePost(long reactionId) {
		reactionrepo.deleteById(reactionId);
		return true;
	}
	
	public List<Reactions> getAllReactionDetails() {
		Iterator<Reactions> it=reactionrepo.findAll().iterator();
		ArrayList<Reactions> list = new ArrayList<>();
		while(it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
}
