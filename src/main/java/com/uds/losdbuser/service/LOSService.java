package com.uds.losdbuser.service;

import java.util.Map;
import java.util.Set;

public interface LOSService {

	
	Set<Map<String, String>> fetchTables(String product);
	
	Set<Map<String, String>> fetchColumns(String  product, String table);
	
	Set<Map<String, String>> fetchValidation(String product, String table, String columnName);
	
}
