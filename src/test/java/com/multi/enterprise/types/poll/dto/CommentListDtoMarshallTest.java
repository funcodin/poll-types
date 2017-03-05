/**
 * 
 */
package com.multi.enterprise.types.poll.dto;

import org.junit.Assert;

import com.multi.enterprise.commons.marshal.BaseMarshalTest;
import com.multi.enterprise.types.poll.CommentListDTO;

/**
 * @author Robot
 *
 */
public class CommentListDtoMarshallTest extends BaseMarshalTest<CommentListDTO> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#createTestObject()
	 */
	@Override
	protected CommentListDTO createTestObject() throws Exception {
		return DtoUtils.commentListDto();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#validateObject(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void validateObject(CommentListDTO expected, CommentListDTO testObject) throws AssertionError {
		Assert.assertEquals(expected.getLimit(), testObject.getLimit());
	}

}
