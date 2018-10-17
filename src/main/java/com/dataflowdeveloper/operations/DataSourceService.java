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
	public List<Inception> search(String query) {
		if (query == null) {
			return null;
		}

		List<Inception> results = new ArrayList<>();
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement ps = connection
					.prepareStatement("select * from inception WHERE top1 like ? or top2 like ? or top3 like ? or top4 like ? or top5 like ? LIMIT ?");
			ps.setString(1, "%" + query + "%");
			ps.setString(2, "%" + query + "%");
                        ps.setString(3, "%" + query + "%");
                        ps.setString(4, "%" + query + "%");
                        ps.setString(5, "%" + query + "%");
			ps.setInt(6, Integer.parseInt(querylimit));
			ResultSet res = ps.executeQuery();
			Inception inception = null;
			while (res.next()) {
				inception = new Inception();
				inception.setTop1(res.getString("top1"));
				results.add(inception);
			}

			res.close();
			ps.close();
			connection.close();
			res = null;
			ps = null;
			connection = null;
			inception = null;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return results;
	}
}
