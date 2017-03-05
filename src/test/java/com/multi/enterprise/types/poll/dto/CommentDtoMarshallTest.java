/**
 * 
 */
package com.multi.enterprise.types.poll.dto;

import org.junit.Assert;

import com.multi.enterprise.commons.marshal.BaseMarshalTest;
import com.multi.enterprise.types.poll.CommentDTO;

/**
 * @author Robot
 *
 */
public class CommentDtoMarshallTest extends BaseMarshalTest<CommentDTO> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#createTestObject()
	 */
	@Override
	protected CommentDTO createTestObject() throws Exception {

		return DtoUtils.commentDTO("This is a random comment");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#validateObject(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void validateObject(CommentDTO expected, CommentDTO testObject) throws AssertionError {
		Assert.assertEquals(expected.getUserId(), testObject.getUserId());

	}

}
