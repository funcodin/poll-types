/**
 * 
 */
package com.multi.enterprise.types.poll.accounts;

import com.multi.enterprise.types.AbstractPersistable;

/**
 * @author Robot
 *
 */
public class UserStatistics extends AbstractPersistable {
	private String userId;
	private int questionsAsked;
	private int questionsAnswered;
	private int commentCount;

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
	 * @return the questionsAsked
	 */
	public int getQuestionsAsked() {
		return questionsAsked;
	}

	/**
	 * @param questionsAsked the questionsAsked to set
	 */
	public void setQuestionsAsked(int questionsAsked) {
		this.questionsAsked = questionsAsked;
	}

	/**
	 * @return the questionsAnswered
	 */
	public int getQuestionsAnswered() {
		return questionsAnswered;
	}

	/**
	 * @param questionsAnswered the questionsAnswered to set
	 */
	public void setQuestionsAnswered(int questionsAnswered) {
		this.questionsAnswered = questionsAnswered;
	}

	/**
	 * @return the commentCount
	 */
	public int getCommentCount() {
		return commentCount;
	}

	/**
	 * @param commentCount the commentCount to set
	 */
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

}
