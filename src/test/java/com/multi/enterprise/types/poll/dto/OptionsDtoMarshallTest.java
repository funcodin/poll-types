/**
 * 
 */
package com.multi.enterprise.types.poll.dto;

import org.junit.Assert;

import com.multi.enterprise.commons.marshal.BaseMarshalTest;
import com.multi.enterprise.types.poll.OptionDTO;

/**
 * @author Robot
 *
 */
public class OptionsDtoMarshallTest extends BaseMarshalTest<OptionDTO> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#createTestObject()
	 */
	@Override
	protected OptionDTO createTestObject() throws Exception {
		return DtoUtils.createOptionDTO("Yes");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#validateObject(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void validateObject(OptionDTO expected, OptionDTO testObject) throws AssertionError {
		Assert.assertEquals(expected.getOptionValue(), testObject.getOptionValue());
	}

}
