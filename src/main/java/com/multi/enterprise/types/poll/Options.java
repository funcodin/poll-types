/**
 * 
 */
package com.multi.enterprise.types.poll;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.multi.enterprise.types.AbstractEntity;

/**
 * @author Robot
 *
 */
@XmlType
@XmlRootElement(name = "option")
@XmlAccessorType(XmlAccessType.FIELD)
public class Options extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String optionId;
	private String questionId;
	private String optionValue;
	private String optionType;
	private int optionCount;

	/**
	 * @return the id
	 */
	public int getUniqueId() {
		return id;
	}

	/**
	 * @return the optionId
	 */
	public String getOptionId() {
		return optionId;
	}

	/**
	 * @param optionId the optionId to set
	 */
	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}

	/**
	 * @return the questionId
	 */
	public String getQuestionId() {
		return questionId;
	}

	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	/**
	 * @return the optionValue
	 */
	public String getOptionValue() {
		return optionValue;
	}

	/**
	 * @param optionValue the optionValue to set
	 */
	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}

	/**
	 * @return the optionType
	 */
	public String getOptionType() {
		return optionType;
	}

	/**
	 * @param optionType the optionType to set
	 */
	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}

	/**
	 * @return the optionCount
	 */
	public int getOptionCount() {
		return optionCount;
	}

	/**
	 * @param optionCount the optionCount to set
	 */
	public void setOptionCount(int optionCount) {
		this.optionCount = optionCount;
	}

}
