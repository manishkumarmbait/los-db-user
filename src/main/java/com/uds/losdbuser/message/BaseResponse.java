/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uds.losdbuser.message;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BaseResponse {

	private String message;
	private int responseCode;
	private Boolean status;
	Set<Map<String, String>> data = new HashSet<>();

	BaseResponse() {
	}

	public BaseResponse(String message, int responseCode, Boolean status, Set<Map<String, String>> data) {
		this.message = message;
		this.responseCode = responseCode;
		this.status = status;
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Set<Map<String, String>> getData() {
		return data;
	}

	public void setData(Set<Map<String, String>> data) {
		this.data = data;
	}

}
