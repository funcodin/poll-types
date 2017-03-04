/**
 * 
 */
package com.multi.enterprise.types.friends;

import java.util.List;

import com.multi.enterprise.types.AbstractPersistable;

/**
 * @author Robot
 *
 */
public class FriendList extends AbstractPersistable {

	private int totalFriends;
	private List<Friend> userFriends;

	/**
	 * @return the totalFriends
	 */
	public int getTotalFriends() {
		return totalFriends;
	}

	/**
	 * @param totalFriends the totalFriends to set
	 */
	public void setTotalFriends(int totalFriends) {
		this.totalFriends = totalFriends;
	}

	/**
	 * @return the userFriends
	 */
	public List<Friend> getUserFriends() {
		return userFriends;
	}

	/**
	 * @param userFriends the userFriends to set
	 */
	public void setUserFriends(List<Friend> userFriends) {
		this.userFriends = userFriends;
	}

}
