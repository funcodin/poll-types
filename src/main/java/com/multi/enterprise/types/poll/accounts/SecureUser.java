/**
 * 
 */
package com.multi.enterprise.types.poll.accounts;

import com.multi.enterprise.types.AbstractPersistable;

/**
 * @author Robot
 *
 */
public class SecureUser extends AbstractPersistable {

	private String userId;
	private byte[] salt;

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
	 * @return the salt
	 */
	public byte[] getSalt() {
		return salt;
	}

	/**
	 * @param salt the salt to set
	 */
	public void setSalt(byte[] salt) {
		this.salt = salt;
	}

}
