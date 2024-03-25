package com.post.entity;

import java.util.Date;
import java.util.List;



public class PostDTO {
	
	private long postId;
	
	private String postContent;
	

	private Date dateTime;

	private boolean status;

	private List<Attachments> attachment;

	private List<Comments> comments;
	
	private List<Reactions> reactions;

	private List<Share> share;

	private List<Tags> tags;

	private User user;

	private long region;

	private long department;

	private long project;

	public PostDTO() {
		super();
	}

	public PostDTO(long postId, String postContent, Date dateTime, boolean status,
			List<Attachments> attachment, List<Comments> comments, List<Reactions> reactions, List<Share> share,
			List<Tags> tags, User user, long region, long department, long project) {
		super();
		this.postId = postId;
		this.postContent = postContent;
		this.dateTime = dateTime;
		this.status = status;
		this.attachment = attachment;
		this.comments = comments;
		this.reactions = reactions;
		this.share = share;
		this.tags = tags;
		this.user = user;
		this.region = region;
		this.department = department;
		this.project = project;
	}

	public long getPostId() {
		return postId;
	}

	public void setPostId(long postId) {
		this.postId = postId;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public List<Attachments> getAttachment() {
		return attachment;
	}

	public void setAttachment(List<Attachments> attachment) {
		this.attachment = attachment;
	}

	public List<Comments> getComments() {
		return comments;
	}

	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}

	public List<Reactions> getReactions() {
		return reactions;
	}

	public void setReactions(List<Reactions> reactions) {
		this.reactions = reactions;
	}

	public List<Share> getShare() {
		return share;
	}

	public void setShare(List<Share> share) {
		this.share = share;
	}

	public List<Tags> getTags() {
		return tags;
	}

	public void setTags(List<Tags> tags) {
		this.tags = tags;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getRegion() {
		return region;
	}

	public void setRegion(long region) {
		this.region = region;
	}

	public long getDepartment() {
		return department;
	}

	public void setDepartment(long department) {
		this.department = department;
	}

	public long getProject() {
		return project;
	}

	public void setProject(long project) {
		this.project = project;
	}

	
	
	

}
