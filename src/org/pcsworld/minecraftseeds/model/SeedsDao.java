package org.pcsworld.minecraftseeds.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;






@Component("seedsDao")
public class SeedsDao {
	private NamedParameterJdbcTemplate jdbc;


	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public boolean create(Seed seed) {
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(seed);
		return jdbc.update("insert into seeds (seedname, seedvalue, platform, submitter, created, modified) values (:seedName, :seedValue, :platform, :submitter, :lastModified, :created)", params) == 1;
	}

	public List<Seed> getSeeds() {
			return jdbc.query("select * from seeds", new RowMapper<Seed>() {
				public Seed mapRow(ResultSet rs, int rowNum) throws SQLException {
					Seed seed = new Seed();
					seed.setSeedName(rs.getString("seedName"));
					seed.setSeedValue(rs.getString("seedValue"));
					seed.setPlatform(rs.getString("platform"));
					seed.setSubmitter(rs.getString("submitter"));
					seed.setCreated(rs.getDate("created"));
					seed.setLastModified(rs.getDate("modified"));
					return seed;
				}
			});
	}
}