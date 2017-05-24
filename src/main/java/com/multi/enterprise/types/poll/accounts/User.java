/**
 * 
 */
package com.multi.enterprise.types.poll.accounts;

import com.multi.enterprise.types.AbstractPersistable;

/**
 * @author Robot
 *
 */
public class User extends AbstractPersistable {

	private String userName;
	private String password;
	private UserDetails userDetails;
	private UserPersonalDetails personalDetails;
	private UserStatistics userStatistics;

	/**
	 * @return the userStatistics
	 */
	public UserStatistics getUserStatistics() {
		return userStatistics;
	}

	/**
	 * @param userStatistics the userStatistics to set
	 */
	public void setUserStatistics(UserStatistics userStatistics) {
		this.userStatistics = userStatistics;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return this.id;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.id = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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
	 * @return the userDetails
	 */
	public UserDetails getUserDetails() {
		return userDetails;
	}

	/**
	 * @param userDetails the userDetails to set
	 */
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	/**
	 * @return the personalDetails
	 */
	public UserPersonalDetails getPersonalDetails() {
		return personalDetails;
	}

	/**
	 * @param personalDetails the personalDetails to set
	 */
	public void setPersonalDetails(UserPersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}

}
