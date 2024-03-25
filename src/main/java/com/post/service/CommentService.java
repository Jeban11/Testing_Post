package com.post.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.post.entity.Comments;
import com.post.repository.CommentRepo;


@Service
public class CommentService {
	
	@Autowired
	CommentRepo commentrepo;

	public boolean addPost(Comments comment) {
		commentrepo.save(comment);
		return true;
	}
	
	public boolean updatePost(Comments comment) {
		commentrepo.save(comment);
		return true;
	}
	
	public boolean deletePost(long commentId) {
		commentrepo.deleteById(commentId);
		return true;
	}
	
	public List<Comments> getAllOptionDetails() {
		Iterator<Comments> it=commentrepo.findAll().iterator();
		ArrayList<Comments> list = new ArrayList<>();
		while(it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

}
