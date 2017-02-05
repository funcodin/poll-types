/**
 * 
 */
package com.multi.enterprise.types.poll.dto;

import org.junit.Assert;

import com.multi.enterprise.commons.marshal.BaseMarshalTest;
import com.multi.enterprise.types.poll.QuestionListDTO;

/**
 * @author Robot
 *
 */
public class QuestionsListDTOMarshallTest extends BaseMarshalTest<QuestionListDTO> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#createTestObject()
	 */
	@Override
	protected QuestionListDTO createTestObject() throws Exception {

		return DtoUtils.createQuestionListDTO();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#validateObject(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void validateObject(QuestionListDTO expected, QuestionListDTO testObject) throws AssertionError {
		Assert.assertEquals(expected.getLimit(), testObject.getLimit());

	}

}
