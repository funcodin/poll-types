/**
 * 
 */
package com.multi.enterprise.commons.marshal;

import java.io.StringReader;
import java.io.StringWriter;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.multi.enterprise.types.jackson.ObjectMapperUtils;
import com.multi.enterprise.types.jaxb.JAXBUtils;
import com.multi.enterprise.types.utils.Jaxb2ContextResolver;

/**
 * @author Robot
 *
 */
public abstract class BaseMarshalTest<T> {

	protected T testObject;

	abstract protected T createTestObject() throws Exception;

	abstract protected void validateObject(final T expected, final T testObject) throws AssertionError;

	@Before
	public void init() throws Exception {
		new Jaxb2ContextResolver("com.multi.enterprise.types");
		this.testObject = this.createTestObject();
	}

	@Test
	public void testJackson() throws Exception {
		this.testJacksonImpl();
	}

	@Test
	public void testJaxb() throws Exception {
		this.testJaxbImpl();
	}

	protected T testJacksonImpl() throws Exception {
		final ObjectMapper mapper = ObjectMapperUtils.createWithDefaults(false, null);
		final StringWriter writer = new StringWriter();
		mapper.writeValue(writer, this.testObject);
		final String json = writer.toString();
		System.out.println(json);
		final T expected = (T) mapper.readValue(new StringReader(json), this.testObject.getClass());

		this.validateObject(expected, this.testObject);
		return expected;
	}

	protected T testJaxbImpl() throws Exception {

		final String jaxbXml = JAXBUtils.toXmlString(this.testObject, true);
		System.out.println(jaxbXml);

		@SuppressWarnings("unchecked")
		final T expected = (T) JAXBUtils.unmarshal(new StringReader(jaxbXml), this.testObject.getClass());
		this.validateObject(expected, this.testObject);
		return expected;
	}

}
