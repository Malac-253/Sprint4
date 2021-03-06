package models;

import java.io.Serializable;

public class Person implements Serializable {
	

	private static final long serialVersionUID = -1952576292459976550L;
	public String username;
	public String password;
	public String department;
	public Boolean isAdmin;
	private boolean internalTesting = true;
	
	public Person() {
		
	}
	
	public Person(String username, String password, String department, Boolean isAdmin) {
		this.username = username;
		this.password = password;
		this.department = department;
		this.isAdmin = isAdmin;
	}
	@Override
	public String toString() {
		return "Person [username=" + username + ", password=" + password + ", department=" + department + ", isAdmin="
				+ isAdmin + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
}
