package com.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.post.entity.Reactions;

@Repository
public interface ReactionsRepo extends JpaRepository<Reactions, Long> {

}
