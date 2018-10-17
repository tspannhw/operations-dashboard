package com.dataflowdeveloper.operations;

//https://www.baeldung.com/spring-boot-logging

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("DataSourceService")
public class DataSourceService {

	@Autowired
	public DataSource dataSource;

	// default to empty
	public Inception defaultValue() {
		return new Inception();
	}

	// querylimit
	@Value("${querylimit}")
	private String querylimit;

	/**
	 * 
	 * @param query
	 *            - search msg
	 * @return List of Inception
	 */
	public List<Yolo> search(String query) {
		if (query == null) {
			return null;
		}

		List<Yolo> results = new ArrayList<>();
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement ps = connection
					.prepareStatement("select * from gluoncvyolo WHERE imgname like ? or imgnamep like ? or class1 like ? or host like ? or te like ? LIMIT ?");
			ps.setString(1, "%" + query + "%");
			ps.setString(2, "%" + query + "%");
			ps.setString(3, "%" + query + "%");
			ps.setString(4, "%" + query + "%");
			ps.setString(5, "%" + query + "%");
			ps.setInt(6, Integer.parseInt(querylimit));
			ResultSet res = ps.executeQuery();
			Yolo yolo = null;
			while (res.next()) {
				yolo = new Yolo();
				yolo.setBattery(res.getString("battery"));
				yolo.setClass1(res.getString("class1"));
				yolo.setCpu(res.getString("cpu"));
				yolo.setDiskuage(res.getString("diskusage"));
				yolo.setEnd(res.getString("end"));
				yolo.setHost(res.getString("host"));
				yolo.setId(res.getString("id"));
				yolo.setImgname(res.getString("imgname"));
				yolo.setImgnamep(res.getString("imgnamep"));
				yolo.setMemory(res.getString("memory"));
				yolo.setPct1(res.getString("pct1"));
				yolo.setShape(res.getString("shape"));
				yolo.setSystemtime(res.getString("systemtime"));
				yolo.setTe(res.getString("te"));
				results.add(yolo);
			}

			
			//CREATE EXTERNAL TABLE IF NOT EXISTS gluoncvyolo (imgname STRING, imgnamep STRING, class1 STRING, pct1 STRING, host STRING, shape STRING, `end` STRING,
			// te STRING, battery INT, systemtime STRING, cpu DOUBLE, diskusage STRING, memory DOUBLE, id STRING) STORED AS ORC LOCATION '/gluoncvyolo'
			
			
			res.close();
			ps.close();
			connection.close();
			res = null;
			ps = null;
			connection = null;
			yolo = null;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return results;
	}
}
