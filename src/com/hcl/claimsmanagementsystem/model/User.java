package com.hcl.claimsmanagementsystem.model;

/**
 * @author reddy-madhumitha
 *
 */
public class User {
	private int id;
	private String userId;
	private String password;
	private String confirmPassword;
	private int roleId;
	/**
	 * @param id
	 * @param userId
	 * @param password
	 * @param confirmPassword
	 * @param roleId
	 */
	public User(int id, String userId, String password, String confirmPassword, int roleId) {
		super();
		this.id = id;
		this.userId = userId;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.roleId = roleId;
	}
	/**
	 * 
	 */
	public User() {
		super();
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}
	/**
	 * @param confirmPassword the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	/**
	 * @return the roleId
	 */
	public int getRoleId() {
		return roleId;
	}
	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	

}
