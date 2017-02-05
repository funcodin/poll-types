/**
 * 
 */
package com.multi.enterprise.types.poll.dto;

import org.junit.Assert;

import com.multi.enterprise.commons.marshal.BaseMarshalTest;
import com.multi.enterprise.types.poll.OptionType;
import com.multi.enterprise.types.poll.QuestionDTO;

/**
 * @author Robot
 *
 */
public class QuestionDtoMarshallTest extends BaseMarshalTest<QuestionDTO> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#createTestObject()
	 */
	@Override
	protected QuestionDTO createTestObject() throws Exception {
		return DtoUtils.createQuestionDTO("This is a test quest", OptionType.BINARY);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#validateObject(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void validateObject(QuestionDTO expected, QuestionDTO testObject) throws AssertionError {
		Assert.assertEquals(expected.getPollQuestion(), testObject.getPollQuestion());
		Assert.assertEquals(expected.getOptionType(), testObject.getOptionType());

	}

}
