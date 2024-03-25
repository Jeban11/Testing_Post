package com.post.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.post.entity.Attachments;
import com.post.repository.AttachmentsRepo;

@Service
public class AttachmentsService {
	
	@Autowired
	AttachmentsRepo filerepo;
	
public Attachments storeFile(MultipartFile file)throws IOException{
		
		String filename = StringUtils.cleanPath(file.getOriginalFilename());
		Attachments fData = new Attachments(filename, file.getContentType(), file.getBytes());
		return filerepo.save(fData);
		
	}

}
