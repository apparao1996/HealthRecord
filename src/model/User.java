package model;

public class User 
{
	private String id;
	private String name;
	private String mobile;
	private String password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String id, String name, String mobile, String password) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.password = password;
	}
	
	
	

}
