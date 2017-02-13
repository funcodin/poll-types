/**
 * 
 */
package com.multi.enterprise.types.poll.accounts;

import com.multi.enterprise.types.AbstractPersistable;

/**
 * @author Robot
 *
 */
public class UserDetails extends AbstractPersistable {

	private String userId;
	private AgeGroup ageGroup;
	private Gender gender;

	// TODO add location details ??

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
	 * @return the ageGroup
	 */
	public AgeGroup getAgeGroup() {
		return ageGroup;
	}

	/**
	 * @param ageGroup the ageGroup to set
	 */
	public void setAgeGroup(AgeGroup ageGroup) {
		this.ageGroup = ageGroup;
	}

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
