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
	private String question;
	private String optionType;
	private String qrCodeUrl;
	private String mediaUrl;
	private String userId;
	private int totalVotes;
	private List<Options> opitons;

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return this.question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(final String question) {
		this.question = question;
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
	 * @return the qrCodeUrl
	 */
	public String getQrCodeUrl() {
		return this.qrCodeUrl;
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
		return this.mediaUrl;
	}

	/**
	 * @param mediaUrl the mediaUrl to set
	 */
	public void setMediaUrl(final String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return this.userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(final String userId) {
		this.userId = userId;
	}

	/**
	 * @return the totalVotes
	 */
	public int getTotalVotes() {
		return this.totalVotes;
	}

	/**
	 * @param totalVotes the totalVotes to set
	 */
	public void setTotalVotes(final int totalVotes) {
		this.totalVotes = totalVotes;
	}

	/**
	 * @return the opitons
	 */
	public List<Options> getOpitons() {
		return this.opitons;
	}

	/**
	 * @param opitons the opitons to set
	 */
	public void setOpitons(final List<Options> opitons) {
		this.opitons = opitons;
	}

}
