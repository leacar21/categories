package com.despegar.aftersale.dto;

import java.util.Date;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

public class ReplieDTO {
	
	@CsvBindByName
	private String id;
	
	@CsvBindByName
	private String reason;
	
	@CsvBindByName
	private String otherReason;
	
	@CsvBindByName
	private String user;
	
	@CsvBindByName
	private String type;
	
	@CsvBindByName
	@CsvDate("yyyy-MM-dd hh:mm:ss")
	private Date createdDate;
	
	@CsvBindByName
	private String text;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getOtherReason() {
		return otherReason;
	}
	public void setOtherReason(String otherReason) {
		this.otherReason = otherReason;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
