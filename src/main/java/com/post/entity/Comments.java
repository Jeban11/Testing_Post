package com.post.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_comments")
public class Comments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="comment_id")
	private long commentId;
    @ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="user_id")
	private User user;
	@Column(name="date_time")
	private Date dateTime;
	@Column(name="content")
	private String content;
	public Comments() {
		super();
	}
	public Comments(long commentId, User user, Date dateTime, String content) {
		super();
		this.commentId = commentId;
		this.user = user;
		this.dateTime = dateTime;
		this.content = content;
	}
	public long getCommentId() {
		return commentId;
	}
	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
