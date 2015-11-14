package org.pcsworld.minecraftseeds.model;

import java.util.Date;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;




@Component("seedsDao")
public class SeedsDao {
	private NamedParameterJdbcTemplate jdbc;


	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public boolean create(Seed seed) {
		
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(seed);
/*
 * 	private String seedName;
	private String seedValue;
	private String platform;
	private String submitter;
	private Date lastModified;
	private Date created;		
 */
		return jdbc.update("insert into seeds (seedname, seedvalue, platform, submitter, created, modified) values (:name, :text, :email)", params) == 1;
	}
}
