/**
 * 
 */
package com.multi.enterprise.types.poll;

import java.util.Date;
import java.util.UUID;

import org.junit.Assert;

import com.multi.enterprise.commons.marshal.BaseMarshalTest;

/**
 * @author Robot
 *
 */
public class OptionsMarshalTest extends BaseMarshalTest<Options> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#createTestObject()
	 */
	@Override
	protected Options createTestObject() throws Exception {
		Options options = new Options();
		options.setCreatedDate(new Date());
		options.setModifiedDate(new Date());
		options.setId(UUID.randomUUID().toString());
		options.setOptionId(UUID.randomUUID().toString());
		options.setOptionValue("Yes");
		options.setOptionType(OptionType.MULTIPLE.name());
		options.setQuestionId(UUID.randomUUID().toString());
		options.setOptionCount(1);
		return options;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multi.enterprise.commons.marshal.BaseMarshalTest#validateObject(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void validateObject(Options expected, Options testObject) throws AssertionError {
		Assert.assertEquals(expected.getOptionCount(), testObject.getOptionCount());
		Assert.assertEquals(expected.getOptionId(), testObject.getOptionId());
		Assert.assertEquals(expected.getOptionType(), testObject.getOptionType());
	}

}
