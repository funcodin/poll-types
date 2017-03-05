/**
 * 
 */
package com.multi.enterprise.types.poll;

import java.util.List;

/**
 * @author Robot
 *
 */
public class CommentList {

	private int lastCommentIndex;
	private int limit;
	private boolean isLastPage;
	private List<Comment> comments;

	/**
	 * @return the lastCommentIndex
	 */
	public int getLastCommentIndex() {
		return lastCommentIndex;
	}

	/**
	 * @param lastCommentIndex the lastCommentIndex to set
	 */
	public void setLastCommentIndex(int lastCommentIndex) {
		this.lastCommentIndex = lastCommentIndex;
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
	 * @return the comments
	 */
	public List<Comment> getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

}
