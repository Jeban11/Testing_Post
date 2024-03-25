package com.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.post.entity.Attachments;
@Repository
public interface AttachmentsRepo extends JpaRepository<Attachments, Long>{

}
