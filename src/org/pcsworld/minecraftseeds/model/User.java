package org.pcsworld.minecraftseeds.model;

public class User {
	private String userName;
	private String password;
	private String email;
	private boolean enabled;
	private String name;

	public User (){
	}
	
	public User(String userName, String password, String email, boolean enabled, String name) {
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.enabled = enabled;
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + ", enabled=" + enabled + ", name=" + name + "]";
	}

}
