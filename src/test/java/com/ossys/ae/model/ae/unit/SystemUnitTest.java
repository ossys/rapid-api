package com.ossys.ae.model.ae.unit;

import com.ossys.ae.model.ae.System;
import com.ossys.ae.model.utils.Utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SystemUnitTest {

	@Test
	public void testDefaultValues() {
		System system = new System();
		assertEquals(null, system.getId());
		assertEquals("", system.getName());
	}

	@Test
	public void testIdSetter() {
		System system = new System();

	}

	@Test
	public void testNameSetter() {
		System _system = new System();
		String name = Utils.generateRandomString(10, 10000);
		_system.setName(name);
		assertEquals("setName() did not allow us to set an expected acceptable value", name, _system.getName());

		_system = new System();
		_system.setName(null);
		assertNotNull("name is a required attribute and should not be nullable.", _system.getName());
	}

}