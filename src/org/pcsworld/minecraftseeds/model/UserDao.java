package org.pcsworld.minecraftseeds.model;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component("UserDao")
public class UserDao {

		private NamedParameterJdbcTemplate jdbc;


		@Autowired
		public void setDataSource(DataSource jdbc) {
			this.jdbc = new NamedParameterJdbcTemplate(jdbc);
		}

		public boolean create(User user) {
			BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(user);
			return jdbc.update("insert into users (username, password, email, enabled, name) values (:userName, :password, :email, :enabled, :name)", params) == 1;
		}
}
