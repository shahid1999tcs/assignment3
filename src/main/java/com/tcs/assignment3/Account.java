<<<<<<< HEAD
package com.tcs.assignment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Account {
	private int ID;
	private String owner;
	private String city;
	private String state;
	private int pin;
	private long phone_number;
	private int house_number;
	private String street;
	private int balance;
	private Date created_date;
	private String status;
	private String account_type;
	
	public void deposit(int amount) {
		String URL = "jdbc:mysql://localhost/assignment";
		String USER = "root";
		String PASSWORD = "Nuvelabs123$";
		
			try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
					Statement statement = connection.createStatement();){
				statement.executeUpdate("UPDATE account SET balance=balance+" + amount + " WHERE ID=" + this.ID);
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public void withdraw(int amount) {
		String URL = "jdbc:mysql://localhost/assignment";
		String USER = "root";
		String PASSWORD = "Nuvelabs123$";
		
		if(amount<this.balance) {
		
			try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
					Statement statement = connection.createStatement();){
				statement.execute("UPDATE account SET balance=balance-" + amount + " WHERE ID=" + this.ID);
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public int getHouse_number() {
		return house_number;
	}
	public void setHouse_number(int house_number) {
		this.house_number = house_number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	@Override
	public String toString() {
		return "Account [ID=" + ID + ", owner=" + owner + " Address[" + "city=" + city + ", state=" + state + ", pin=" + pin
				+ ", phone_number=" + phone_number + ", house_number=" + house_number + ", street=" + street + "]"
				+ ", balance=" + balance + ", created_date=" + created_date + ", status=" + status + ", account_type="
				+ account_type + "]";
	}
	
}
=======
package com.tcs.assignment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Account {
	private int ID;
	private String owner;
	private String city;
	private String state;
	private int pin;
	private long phone_number;
	private int house_number;
	private String street;
	private int balance;
	private Date created_date;
	private String status;
	private String account_type;
	
	public void deposit(int amount) {
		String URL = "jdbc:mysql://localhost/assignment";
		String USER = "root";
		String PASSWORD = "Nuvelabs123$";
		
			try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
					Statement statement = connection.createStatement();){
				statement.executeUpdate("UPDATE account SET balance=balance+" + amount + " WHERE ID=" + this.ID);
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public void withdraw(int amount) {
		String URL = "jdbc:mysql://localhost/assignment";
		String USER = "root";
		String PASSWORD = "Nuvelabs123$";
		
		if(amount<this.balance) {
		
			try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
					Statement statement = connection.createStatement();){
				statement.execute("UPDATE account SET balance=balance-" + amount + " WHERE ID=" + this.ID);
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public int getHouse_number() {
		return house_number;
	}
	public void setHouse_number(int house_number) {
		this.house_number = house_number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	@Override
	public String toString() {
		return "Account [ID=" + ID + ", owner=" + owner + " Address[" + "city=" + city + ", state=" + state + ", pin=" + pin
				+ ", phone_number=" + phone_number + ", house_number=" + house_number + ", street=" + street + "]"
				+ ", balance=" + balance + ", created_date=" + created_date + ", status=" + status + ", account_type="
				+ account_type + "]";
	}
	
}
>>>>>>> f27f32259575254bfc48574e4359d3441f2d02ea
