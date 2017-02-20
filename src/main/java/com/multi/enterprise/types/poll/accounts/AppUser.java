/**
 * 
 */
package com.multi.enterprise.types.poll.accounts;

import java.util.Set;

/**
 * @author Robot
 *
 */
public class AppUser {

	public String userId;
	public String userName;
	public Set<String> associatedGroups;

	/**
	 * @return the associatedGroups
	 */
	public Set<String> getAssociatedGroups() {
		return associatedGroups;
	}

	/**
	 * @param associatedGroups the associatedGroups to set
	 */
	public void setAssociatedGroups(Set<String> associatedGroups) {
		this.associatedGroups = associatedGroups;
	}

}
