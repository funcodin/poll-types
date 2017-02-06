/**
 * 
 */
package com.multi.enterprise.types.poll;

import java.util.List;

import com.multi.enterprise.types.AbstractPersistable;

/**
 * @author Robot
 *
 */
public class QuestionList extends AbstractPersistable {

	private int lastQuestionIndex;
	private int limit;
	private boolean isLastPage;
	private List<Question> questions;

	/**
	 * @return the lastQuestionIndex
	 */
	public int getLastQuestionIndex() {
		return lastQuestionIndex;
	}

	/**
	 * @param lastQuestionIndex the lastQuestionIndex to set
	 */
	public void setLastQuestionIndex(int lastQuestionIndex) {
		this.lastQuestionIndex = lastQuestionIndex;
	}

	/**
	 * @return the limit
	 */
	public int getLimit() {
		return limit;
	}

	/**
	 * @param limit the limit to set
	 */
	public void setLimit(int limit) {
		this.limit = limit;
	}

	/**
	 * @return the isLastPage
	 */
	public boolean isLastPage() {
		return isLastPage;
	}

	/**
	 * @param isLastPage the isLastPage to set
	 */
	public void setLastPage(boolean isLastPage) {
		this.isLastPage = isLastPage;
	}

	/**
	 * @return the questions
	 */
	public List<Question> getQuestions() {
		return questions;
	}

	/**
	 * @param questions the questions to set
	 */
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

}
