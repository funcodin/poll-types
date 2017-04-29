/**
 * 
 */
package com.multi.enterprise.types.poll.dto;

import org.junit.Assert;

import com.multi.enterprise.commons.marshal.BaseMarshalTest;
import com.multi.enterprise.types.users.UserResetDTO;

/**
 * @author Robot
 *
 */
public class UserResetDtoMarshallTest extends BaseMarshalTest<UserResetDTO> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#createTestObject()
	 */
	@Override
	protected UserResetDTO createTestObject() throws Exception {
		return DtoUtils.createUserResetDTO();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#validateObject(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void validateObject(UserResetDTO expected, UserResetDTO testObject) throws AssertionError {
		Assert.assertEquals(expected.getEmail(), testObject.getEmail());

	}

}
