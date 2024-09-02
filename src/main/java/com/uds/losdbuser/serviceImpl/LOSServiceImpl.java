package com.uds.losdbuser.serviceImpl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uds.losdbuser.entity.UdsDetail;
import com.uds.losdbuser.repository.LOSRepository;
import com.uds.losdbuser.service.LOSService;

@Service
public class LOSServiceImpl implements LOSService {

	@Autowired
	private LOSRepository lOSRepository;

	@Override
	public Set<Map<String, String>> fetchTables(String product) {

		Set<Map<String, String>> userDetailList = new HashSet<>();

		List<UdsDetail> losDetailList = lOSRepository.fetchTables(product);

		for (UdsDetail losDetail : losDetailList) {
			Map<String, String> userDetail = new HashMap<>();
			userDetail.put("value", losDetail.getUDSD_TableName());
			userDetail.put("label", losDetail.getUDSD_TableName());
			userDetailList.add(userDetail);
		}
		return userDetailList;
	}
	
	@Override
	public Set<Map<String, String>> fetchColumns(String product, String table) {
		Set<Map<String, String>> userDetailList = new HashSet<>();
		List<UdsDetail> losDetailList = lOSRepository.fetchColumns(product, table);

		for (UdsDetail losDetail : losDetailList) {
			Map<String, String> userDetail = new HashMap<>();
			userDetail.put("value", losDetail.getUDSD_ColumnName());
			userDetail.put("label", losDetail.getUDSD_ColumnName());
			userDetailList.add(userDetail);
		}

		return userDetailList;
	}
	
	@Override
	public Set<Map<String, String>> fetchValidation(String product, String table, String columnName) {

		
		Set<Map<String, String>> userDetailList = new HashSet<>();
		List<UdsDetail> losDetailList = lOSRepository.fetchValidation(product, table, columnName);

		for (UdsDetail losDetail : losDetailList) {
			Map<String, String> userDetail = new HashMap<>();
			userDetail.put("value", losDetail.getUDSD_Columnvalidation());
			userDetail.put("label", losDetail.getUDSD_Columnvalidation());
			userDetailList.add(userDetail);
		}

		return userDetailList;
		
	}

}
