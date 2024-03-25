package com.post.entity;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_posts")
@Component
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "post_id")
	private long postId;

	@Column(name = "post_content") // Adjust length if needed
	private String postContent;
	
	@CreationTimestamp
	@Column(name = "date_time")
	private Date dateTime;

	private boolean status = true;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "post_id")
	private List<Attachments> attachment;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "post_id")
	private List<Comments> comments;


	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "post_id")
	private List<Reactions> reactions;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "post_id")
	private List<Share> share;


	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "post_id")
	private List<Tags> tags;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "region_id")
	private Region region;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "department_id")
	private Department department;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "project_id")
	private Project project;

	public Post() {
		super();
	}

	public Post(long postId, String postContent, Date dateTime, boolean status,
			List<Attachments> attachment, List<Comments> comments, List<Reactions> reactions, List<Share> share,
			List<Tags> tags, User user, Region region, Department department, Project project) {
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

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	

}
