/**
 * 
 */
package com.multi.enterprise.types.poll;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.multi.enterprise.types.AbstractEntity;

/**
 * @author Robot
 *
 */
@XmlRootElement(name = "option")
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
	@XmlElement(name = "uniqueId")
	public int getUniqueId() {
		return id;
	}

	/**
	 * @return the optionId
	 */
	@XmlElement(name = "optionId")
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
	@XmlElement(name = "questionId")
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
	@XmlElement(name = "optionValue")
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
	@XmlElement(name = "optionType")
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
	@XmlElement(name = "optionCount")
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
