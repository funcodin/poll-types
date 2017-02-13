/**
 * 
 */
package com.multi.enterprise.types.poll.accounts;

import java.util.Set;

import com.multi.enterprise.types.AbstractPersistable;

/**
 * @author Robot
 *
 */
public class PollGroups extends AbstractPersistable {

	private String groupId;
	private String groupName;
	private String groupAdminId;
	private boolean isPrivate;
	private Set<String> groupMembers;

	/**
	 * @return the groupId
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * @param groupName the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * @return the groupAdminId
	 */
	public String getGroupAdminId() {
		return groupAdminId;
	}

	/**
	 * @param groupAdminId the groupAdminId to set
	 */
	public void setGroupAdminId(String groupAdminId) {
		this.groupAdminId = groupAdminId;
	}

	/**
	 * @return the isPrivate
	 */
	public boolean isPrivate() {
		return isPrivate;
	}

	/**
	 * @param isPrivate the isPrivate to set
	 */
	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	/**
	 * @return the groupMembers
	 */
	public Set<String> getGroupMembers() {
		return groupMembers;
	}

	/**
	 * @param groupMembers the groupMembers to set
	 */
	public void setGroupMembers(Set<String> groupMembers) {
		this.groupMembers = groupMembers;
	}

}
