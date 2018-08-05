package com.vsky.utils;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 
 * @date 2018年8月4日下午4:43:05
 * @author maguoying@188.com
 * @Description
 */
public class JDBCUtils {
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
	

	public static DataSource getDataSource() {
		return dataSource;
	}
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
		
	}
}
