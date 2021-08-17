package com.tcs.assignment3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Operations {
	
	public static Logger logger = LogManager.getLogger(Operations.class);
	public static List<Account> accounts = new ArrayList<Account>();
	public static void main(String[] args) throws ParseException {
		String URL = "jdbc:mysql://localhost/assignment";
		String USER = "root";
		String PASSWORD = "Nuvelabs123$";
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				Statement statement = connection.createStatement();) {
			retrieve(statement);
			//insert(statement);
			//retrieve(statement);
			update(statement,1,100);
			retrieve(statement);
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void update(Statement statement, int id, int amount) throws SQLException {
		
		Account account = accounts.get(0);
		account.withdraw(100);
		
	}

	private static void insert(Statement statement) throws SQLException{
		statement.execute("INSERT INTO account(ID,owner_name,city,state,pin,phone_number,house_number,street,balance,status,account_type) VALUES(4,'Shahid','Mumbai', 'Maharashtra', 400054, 1234567890, 12, 'Holy Street', 50000, 'ACTIVE' , 'SAVINGS')\r\n"
				+ "");
		
	}

	private static void retrieve(Statement statement) throws SQLException {
		ResultSet resultset = statement.executeQuery("SELECT * FROM account");
		while (resultset.next()) {
			Account account = new Account();
			//logger.debug((resultset.getInt(1)));// column index starts from 1
			System.out.println(resultset.getString(1));
			account.setID(resultset.getInt(1));
			account.setOwner(resultset.getString(2));
			account.setCity(resultset.getString(3));
			account.setState(resultset.getString(4));
			account.setPin(resultset.getInt(5));
			account.setPhone_number(resultset.getLong(6));
			account.setHouse_number(resultset.getInt(7));
			account.setStreet(resultset.getString(8));
			account.setBalance(resultset.getInt(9));
			account.setCreated_date(resultset.getDate(10));
			account.setStatus(resultset.getString(11));
			account.setAccount_type(resultset.getString(12));
			Operations.accounts.add(account);
		}
		logger.fatal(accounts);
		
	}

}
