package com.uds.losdbuser.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uds.losdbuser.entity.UdsDetail;

@Repository
public interface LOSRepository extends JpaRepository<UdsDetail, Integer> {

	@Query(nativeQuery = true, value = "select DISTINCT * from uds_detail u where u.UDSD_PRODUCT = ?1")
	List<UdsDetail> fetchTables(String product);

	@Query(nativeQuery = true, value = "select distinct * from uds_detail u where u.UDSD_PRODUCT = ?1 AND u.UDSD_TableName = ?2")
	List<UdsDetail> fetchColumns(String  product, String table);

	@Query(nativeQuery = true, value = "select distinct * from uds_detail u where u.UDSD_PRODUCT = ?1 AND u.UDSD_TableName = ?2 AND u.UDSD_ColumnName = ?3")
	List<UdsDetail> fetchValidation(String product, String table, String columnName);

}