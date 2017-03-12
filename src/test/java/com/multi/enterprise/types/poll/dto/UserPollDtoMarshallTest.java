/**
 * 
 */
package com.multi.enterprise.types.poll.dto;

import org.junit.Assert;

import com.multi.enterprise.commons.marshal.BaseMarshalTest;
import com.multi.enterprise.types.poll.UserPollDTO;

/**
 * @author Robot
 *
 */
public class UserPollDtoMarshallTest extends BaseMarshalTest<UserPollDTO> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#createTestObject()
	 */
	@Override
	protected UserPollDTO createTestObject() throws Exception {
		return DtoUtils.createUserPollDTO();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#validateObject(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void validateObject(UserPollDTO expected, UserPollDTO testObject) throws AssertionError {
		Assert.assertEquals(expected.getOptionId(), testObject.getOptionId());
	}

}
