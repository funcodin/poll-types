/**
 * 
 */
package com.multi.enterprise.types.friends;

import java.util.List;

/**
 * @author Robot
 *
 */
public class FriendRequestList {

	private List<FriendRequest> pendingFriendRequest;

	/**
	 * @return the pendingFriendRequest
	 */
	public List<FriendRequest> getPendingFriendRequest() {
		return pendingFriendRequest;
	}

	/**
	 * @param pendingFriendRequest the pendingFriendRequest to set
	 */
	public void setPendingFriendRequest(List<FriendRequest> pendingFriendRequest) {
		this.pendingFriendRequest = pendingFriendRequest;
	}

}
