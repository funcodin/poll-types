/**
 * 
 */
package com.multi.enterprise.types.poll;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.multi.enterprise.types.AbstractPersistable;

/**
 * @author Robot
 *
 */
@XmlType
@XmlRootElement(name = "option")
@XmlAccessorType(XmlAccessType.FIELD)
public class Options extends AbstractPersistable implements Serializable {

	private static final long serialVersionUID = 1L;
	private String questionId;
	private String optionValue;
	private String optionType;
	private int voteCount;

	/**
	 * @return the questionId
	 */
	public String getQuestionId() {
		return this.questionId;
	}

	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(final String questionId) {
		this.questionId = questionId;
	}

	/**
	 * @return the optionValue
	 */
	public String getOptionValue() {
		return this.optionValue;
	}

	/**
	 * @param optionValue the optionValue to set
	 */
	public void setOptionValue(final String optionValue) {
		this.optionValue = optionValue;
	}

	/**
	 * @return the optionType
	 */
	public String getOptionType() {
		return this.optionType;
	}

	/**
	 * @param optionType the optionType to set
	 */
	public void setOptionType(final String optionType) {
		this.optionType = optionType;
	}

	/**
	 * @return the voteCount
	 */
	public int getVoteCount() {
		return this.voteCount;
	}

	/**
	 * @param voteCount the voteCount to set
	 */
	public void setVoteCount(final int voteCount) {
		this.voteCount = voteCount;
	}

}
