/**
 * 
 */
package com.multi.enterprise.types.poll.dto;

import org.junit.Assert;

import com.multi.enterprise.commons.marshal.BaseMarshalTest;
import com.multi.enterprise.types.friends.FriendRequestDTO;

/**
 * @author Robot
 *
 */
public class FriendRequestDtoMarshallTest extends BaseMarshalTest<FriendRequestDTO> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#createTestObject()
	 */
	@Override
	protected FriendRequestDTO createTestObject() throws Exception {
		return DtoUtils.friendRequestDTO();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#validateObject(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void validateObject(FriendRequestDTO expected, FriendRequestDTO testObject) throws AssertionError {
		Assert.assertEquals(expected.getAccepterUserId(), testObject.getAccepterUserId());
	}

}
