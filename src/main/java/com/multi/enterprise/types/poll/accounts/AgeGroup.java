/**
 * 
 */
package com.multi.enterprise.types.poll.accounts;

/**
 * @author Robot
 *
 */
public enum AgeGroup {

	TEEN("18-24"), MID_TWENTY("25-34"), MID_THIRTY("35-44"), MID_FORTY("45-54"), MID_FIFTY_PLUS("55+");

	private String ageRange;

	private AgeGroup(String ageRange) {
		this.ageRange = ageRange;
	}

	public String getAgeRange() {
		return this.ageRange;
	}

}
