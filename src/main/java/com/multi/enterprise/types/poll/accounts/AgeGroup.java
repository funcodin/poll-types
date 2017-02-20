/**
 * 
 */
package com.multi.enterprise.types.poll.accounts;

/**
 * @author Robot
 *
 */
public enum AgeGroup {

	TEEN("18-19"), TWENTIES("20-29"), THIRTIES("30-39"), FORTIES("40-49"), FIFTY_PLUS("50");

	private String ageRange;

	private AgeGroup(String ageRange) {
		this.ageRange = ageRange;
	}

	public String getAgeRange() {
		return this.ageRange;
	}

}
