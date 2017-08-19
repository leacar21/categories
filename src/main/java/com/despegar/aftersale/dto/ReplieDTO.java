package com.despegar.aftersale.dto;

import java.util.Date;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

public class ReplieDTO {
	
//  0 - ID 
//	1 - REASON 
//	2 - FATHER_TYPE 
//	3 - OTHER_REASON 
//	4 - ID 
//	5 - USER 
//	6 - TYPE 
//	7 - SUGGESTION_ID 
//	8 - INTERNAL 
//	9 - CREATED_DATE 
//	10 - TEXT
//	11 - CUSTOM_RESPONSE
	
	@CsvBindByName(column = "ID")
	private String id;
	
	@CsvBindByName(column = "REASON")
	private String reason;
	
	@CsvBindByName(column = "OTHER_REASON")
	private String otherReason;
	
	@CsvBindByName(column = "USER")
	private String user;
	
	@CsvBindByName(column = "TYPE")
	private String type;
	
	@CsvBindByName(column = "CREATED_DATE")
	@CsvDate("yyyy-MM-dd hh:mm:ss")
	private Date createdDate;
	
	@CsvBindByName(column = "TEXT")
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
