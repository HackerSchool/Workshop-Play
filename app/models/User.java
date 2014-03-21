package models;

import org.joda.time.DateTime;

public class User {
	private String name;
	private DateTime birthday;
	private String lastLogin;
	public User(String name, DateTime birthday, String lastLogin) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.lastLogin = lastLogin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DateTime getBirthday() {
		return birthday;
	}
	public void setBirthday(DateTime birthday) {
		this.birthday = birthday;
	}
	public String getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}
}
