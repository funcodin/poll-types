/**
 * 
 */
package com.multi.enterprise.types.poll.dto;

import org.junit.Assert;

import com.multi.enterprise.commons.marshal.BaseMarshalTest;
import com.multi.enterprise.types.users.UserDTO;

/**
 * @author Robot
 *
 */
public class UserDtoMarshallTest extends BaseMarshalTest<UserDTO> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#createTestObject()
	 */
	@Override
	protected UserDTO createTestObject() throws Exception {
		return DtoUtils.createUserDTO();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#validateObject(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void validateObject(UserDTO expected, UserDTO testObject) throws AssertionError {
		Assert.assertEquals(expected.getUsername(), testObject.getUsername());

	}

}
