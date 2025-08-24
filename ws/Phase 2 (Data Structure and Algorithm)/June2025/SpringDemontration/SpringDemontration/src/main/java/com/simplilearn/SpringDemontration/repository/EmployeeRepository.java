package com.simplilearn.SpringDemontration.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.simplilearn.SpringDemontration.model.Employee;

@Repository
public class EmployeeRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Employee> getEmployees() {

		return jdbcTemplate.query("select * from employees", new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setDepartment(rs.getString(4));
				return e;
			}

		});
	}

	public int save(Employee emp) {
		return jdbcTemplate.update("INSERT INTO employees(name, email, department) values(?,?,?)", emp.getName(),
				emp.getEmail(), emp.getDepartment());
	}

}
