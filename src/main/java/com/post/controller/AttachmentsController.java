package com.post.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.post.entity.Attachments;
import com.post.service.AttachmentsService;

@RestController
@CrossOrigin("http://localhost:4200/") 
public class AttachmentsController {
	
	@Autowired
	AttachmentsService attach;
	Attachments attachment;
	
	@PostMapping("/uploads")
	public void uploadfile(@RequestParam("file")MultipartFile file) throws IOException{
		attachment = attach.storeFile(file);
		System.out.println("File Uploaded");
		
	}

}