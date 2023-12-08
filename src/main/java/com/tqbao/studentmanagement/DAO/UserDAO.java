/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tqbao.studentmanagement.DAO;

import com.tqbao.studentmanagement.Model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author tqbao
 */
public class UserDAO implements Repository<User, Integer> {
	private static final String GET_ALL_USER = "select id, name, phone, age, status, role from user";
	private static final String SELECT_USER = "select * from user where id=?";
	private static final String INSERT_USER = "insert into user(name, age, phone, status, role, username, password) values(?,?,?,?,?,?,?)";
	private static final String UPDATE_USER = "update user set name=?, phone=?, age=?,status=?,role=? where id=?";
	private static final String UPDATE_PASSWORD = "update user set password=? where id=?";
	private static final String DELETE_USER = "delete from user where id=?";

	private static final String USE_DB_SQL = "use 521H0494_javaswing";
	private static final String CHECK_LOGIN_SQL = "select * from user where username=? and password=?";
	private static final String CREATE_TABLE_USER = "CREATE TABLE IF NOT EXISTS user("
													+ "id INT AUTO_INCREMENT PRIMARY KEY,"
													+ "name VARCHAR(255) NOT NULL,"
													+ "age INT NOT NULL,"
													+ "phone VARCHAR(255) NOT NULL,"
													+ "status VARCHAR(255) NOT NULL,"
													+ "role VARCHAR(255) NOT NULL,"
													+ "username VARCHAR(255) NOT NULL,"
													+ "password VARCHAR(255) NOT NULL)";


	private static final String DELETE_USER_ADMIN_IF_EXISTS = "delete from user where id = 1";
	private static final String INSERT_USER_ADMIN = "insert into user(id,name, age, phone, status, role, username, password) values(1,\"admin\",20,\"0987654321\",\"Normal\",\"Admin\",\"admin\",\"123456\")";
	private static final String CREATE_DB_SQL = "CREATE DATABASE IF NOT EXISTS 521H0494_javaswing";


	public UserDAO() {
		createDB();
		createTable();
	}
	private void createDB() {
		try (Connection conn = ConnectionDB.getConnection()) {
			Statement stm = (Statement) conn.createStatement();
			stm.executeUpdate(CREATE_DB_SQL);
			System.out.println("Database created successfully...");
			conn.close();
			stm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	private void createTable() {
		try (Connection conn = ConnectionDB.getConnection()) {
			Statement stm = (Statement) conn.createStatement();
			stm.execute(USE_DB_SQL);
			stm.executeUpdate(CREATE_TABLE_USER);
//			stm.executeUpdate(DELETE_USER_ADMIN_IF_EXISTS);
//			stm.executeUpdate(INSERT_USER_ADMIN);
			conn.close();
			stm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Integer add(User user) {
		try (Connection conn = ConnectionDB.getConnection()) {
			PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(INSERT_USER);

			pstm.setString(1, user.getName());
			pstm.setInt(2, user.getAge());
			pstm.setString(3, user.getPhone());
			pstm.setString(4, user.getStatus());
			pstm.setString(5, user.getRole());
			pstm.setString(6, user.getUsername());
			pstm.setString(7, user.getPassword());

			int row = pstm.executeUpdate();

			if (row == 1) {
				System.out.println(user.getRole() + " was added successfully");
			}
			conn.close();
			pstm.close();
		} catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user.getId();
	}

	@Override
	public List<User> readAll() {
		try (Connection conn = ConnectionDB.getConnection()) {
			Statement stm = (Statement) conn.createStatement();
			ResultSet rs = stm.executeQuery(GET_ALL_USER);

			List<User> userList = new ArrayList<User>();

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				int age = rs.getInt(4);
				String status = rs.getString(5);
				String role = rs.getString(6);

				User user = new User(id, name, age, phone, status, role);
				userList.add(user);
			}
			conn.close();
			stm.close();
			rs.close();
			return userList;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public ResultSet getAll() {
		try (Connection conn = ConnectionDB.getConnection()) {
			Statement stm = (Statement) conn.createStatement();
			ResultSet rs = stm.executeQuery(GET_ALL_USER);


			conn.close();
			stm.close();
			rs.close();
			return rs;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	@Override
	public User read(Integer id) {
		try (Connection conn = ConnectionDB.getConnection()) {
			PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(SELECT_USER);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();

			if (rs.next()) {
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String phone = rs.getString(4);
				String status = rs.getString(5);
				String role = rs.getString(6);
				String username = rs.getString(7);
				String password = rs.getString(8);

				User user = new User(id, name, age, phone, status, role, username, password);
				pstm.close();
				rs.close();
				return user;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	public User check(String username, String password) {
		try (Connection conn = ConnectionDB.getConnection()) {
			User user = null;
			PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(CHECK_LOGIN_SQL);
			pstm.setString(1, username);
			pstm.setString(2, password);
			ResultSet rs = pstm.executeQuery();

			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String phone = rs.getString(4);
				String status = rs.getString(5);
				String role = rs.getString(6);
				user = new User(id, name, age, phone, status, role, username, password);
			}

//            System.out.println(user.toString());
			conn.close();
			pstm.close();
			rs.close();
			return user;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public boolean update(User user) {
		try (Connection conn = ConnectionDB.getConnection()) {
			PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(UPDATE_USER);
			pstm.setString(1, user.getName());
			pstm.setString(2, user.getPhone());
			pstm.setInt(3, user.getAge());
			pstm.setString(4, user.getStatus());
			pstm.setString(5, user.getRole());
			pstm.setInt(6, user.getId());

			int updated_row = pstm.executeUpdate();

			if (updated_row > 0) {
				System.out.println(user.getRole() + " has been updated successfully");
				return true;
			}
			System.out.println(user.getRole() + " was not exist");
			conn.close();
			pstm.close();
			return false;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public boolean delete(Integer id) {
		try (Connection conn = ConnectionDB.getConnection()) {
			PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(DELETE_USER);
			pstm.setInt(1, id);
			int row = pstm.executeUpdate();
			if (row > 0) {
				System.out.println("Deleted successfully");
				return true;
			}
			conn.close();
			pstm.close();
			return false;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public boolean updatePassword(Integer id, String password) {
		try (Connection conn = ConnectionDB.getConnection()) {
			PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(UPDATE_PASSWORD);
			pstm.setInt(2, id);
			pstm.setString(1, password);
			int updated_row = pstm.executeUpdate();

			if (updated_row > 0) {
				System.out.println("Password has been updated successfully");
				return true;
			}

			conn.close();
			pstm.close();
			return false;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
