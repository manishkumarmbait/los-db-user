package com.uds.losdbuser.controller;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uds.losdbuser.message.BaseResponse;
import com.uds.losdbuser.message.CustomMessage;
import com.uds.losdbuser.service.LOSService;

@RestController
@RequestMapping(value = "/losapi/uds")
public class LOSController {

	@Autowired
	private LOSService lOSService;

	@GetMapping(value = "/fetchTables")
	public ResponseEntity<?> fetchTables(@RequestParam String product) {
		Set<Map<String, String>> losResponse = lOSService.fetchTables(product);
		BaseResponse response = new BaseResponse(CustomMessage.SUCCESS_MESSAGE, HttpStatus.OK.value(), true,
				losResponse);
		return new ResponseEntity<BaseResponse>(response, HttpStatus.OK);
	}

	@GetMapping(value = "/fetchColumns")
	public ResponseEntity<?> fetchColumns(@RequestParam String product, @RequestParam String table) {

		Set<Map<String, String>> losResponse = lOSService.fetchColumns(product, table);
		BaseResponse response = new BaseResponse(CustomMessage.SUCCESS_MESSAGE, HttpStatus.OK.value(), true,
				losResponse);
		return new ResponseEntity<BaseResponse>(response, HttpStatus.OK);
	}

	@GetMapping(value = "/fetchValidation")
	public ResponseEntity<?> fetchValidation(@RequestParam String product, @RequestParam String table,
			@RequestParam String columnName) {

		Set<Map<String, String>> losResponse = lOSService.fetchValidation(product, table, columnName);
		BaseResponse response = new BaseResponse(CustomMessage.SUCCESS_MESSAGE, HttpStatus.OK.value(), true,
				losResponse);
		return new ResponseEntity<BaseResponse>(response, HttpStatus.OK);
	}
}
