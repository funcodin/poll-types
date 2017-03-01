/**
 * 
 */
package com.multi.enterprise.types.friends;

import com.multi.enterprise.types.AbstractPersistable;

/**
 * @author Robot
 *
 */
public class FriendRequest extends AbstractPersistable {

	public String requesterUserId;
	public String accepterUserId;

	/**
	 * @return the requesterUserId
	 */
	public String getRequesterUserId() {
		return requesterUserId;
	}

	/**
	 * @param requesterUserId the requesterUserId to set
	 */
	public void setRequesterUserId(String requesterUserId) {
		this.requesterUserId = requesterUserId;
	}

	/**
	 * @return the accepterUserId
	 */
	public String getAccepterUserId() {
		return accepterUserId;
	}

	/**
	 * @param accepterUserId the accepterUserId to set
	 */
	public void setAccepterUserId(String accepterUserId) {
		this.accepterUserId = accepterUserId;
	}

}
