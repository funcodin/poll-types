/**
 * 
 */
package com.multi.enterprise.types.poll;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.junit.Assert;

import com.multi.enterprise.commons.marshal.BaseMarshalTest;

/**
 * @author Robot
 *
 */
public class QuestionMarshalTest extends BaseMarshalTest<Question> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#createTestObject()
	 */
	@Override
	protected Question createTestObject() throws Exception {
		Question question = new Question();
		question.setId(UUID.randomUUID().toString());
		question.setCreatedDate(new Date());
		question.setQuestion("Hello World");
		question.setQuestionId(UUID.randomUUID().toString());
		List<Options> optionsList = new ArrayList<>();

		Options options = new Options();
		options.setCreatedDate(new Date());
		options.setModifiedDate(new Date());
		options.setId(UUID.randomUUID().toString());
		options.setOptionId(UUID.randomUUID().toString());
		options.setOptionValue("Yes");
		options.setOptionType(OptionType.MULTIPLE.name());
		options.setQuestionId(UUID.randomUUID().toString());
		options.setOptionCount(1);

		Options options1 = new Options();
		options1.setCreatedDate(new Date());
		options1.setModifiedDate(new Date());
		options1.setId(UUID.randomUUID().toString());
		options1.setOptionId(UUID.randomUUID().toString());
		options1.setOptionValue("Yes");
		options1.setOptionType(OptionType.MULTIPLE.name());
		options1.setQuestionId(UUID.randomUUID().toString());
		options1.setOptionCount(1);
		optionsList.add(options1);

		optionsList.add(options);
		question.setOpitons(optionsList);
		return question;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#validateObject(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void validateObject(Question expected, Question testObject) throws AssertionError {
		Assert.assertEquals(expected.getQuestion(), testObject.getQuestion());

	}

}
