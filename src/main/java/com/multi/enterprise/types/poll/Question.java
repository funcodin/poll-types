/**
 * 
 */
package com.multi.enterprise.types.poll;

import java.io.Serializable;
import java.util.List;

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
@XmlRootElement(name = "quesiton")
@XmlAccessorType(XmlAccessType.FIELD)
public class Question extends AbstractPersistable implements Serializable {
	private static final long serialVersionUID = 1L;
	private String questionId;
	private String question;
	private String optionType;
	private String qrCodeUrl;
	private String mediaUrl;
	private String userId;
	private List<Options> opitons;

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
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
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
	 * @return the qrCodeUrl
	 */
	public String getQrCodeUrl() {
		return qrCodeUrl;
	}

	/**
	 * @param qrCodeUrl the qrCodeUrl to set
	 */
	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}

	/**
	 * @return the mediaUrl
	 */
	public String getMediaUrl() {
		return mediaUrl;
	}

	/**
	 * @param mediaUrl the mediaUrl to set
	 */
	public void setMediaUrl(String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}

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
	 * @return the opitons
	 */
	public List<Options> getOpitons() {
		return opitons;
	}

	/**
	 * @param opitons the opitons to set
	 */
	public void setOpitons(List<Options> opitons) {
		this.opitons = opitons;
	}

}
