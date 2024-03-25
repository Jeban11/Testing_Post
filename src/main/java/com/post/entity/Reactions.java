package com.post.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_reactions")
@Component
public class Reactions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="reaction_id")
	private long reactionId;
	
    @ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="symbol_id")
	private Symbol symbol;

	public Reactions() {
		super();

	}
	public Reactions(long reactionId, User user, Symbol symbolId) {
		super();
		this.reactionId = reactionId;
		this.user = user;
		
	}
	public long getReactionId() {
		return reactionId;
	}
	public void setReactionId(long reactionId) {
		this.reactionId = reactionId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Symbol getSymbol() {
		return symbol;
	}

	
	
	
}
