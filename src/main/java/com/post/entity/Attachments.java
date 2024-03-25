package com.post.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

import jakarta.persistence.Table;

@Entity
@Table(name="tbl_attachment")
public class Attachments {
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long fileId;
	
	@Column(name="file_name")
	private String fileName;
	@Column(name="file_nype")
	private String fileType;
	
	@Lob
	private byte[] fdata;
	
	public Attachments() {
		super();

	}


	public Attachments( String fileName, String fileType, byte[] fdata) {
		super();
		this.fileName = fileName;
		this.fileType = fileType;
		this.fdata = fdata;
	}


	public long getFileId() {
		return fileId;
	}


	public void setFileId(long fileId) {
		this.fileId = fileId;
	}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public String getFileType() {
		return fileType;
	}


	public void setFileType(String fileType) {
		this.fileType = fileType;
	}


	public byte[] getFdata() {
		return fdata;
	}


	public void setFdata(byte[] fdata) {
		this.fdata = fdata;
	}

	

}
