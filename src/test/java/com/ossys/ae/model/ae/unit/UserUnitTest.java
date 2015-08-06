package com.ossys.ae.model.ae.unit;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import com.ossys.ae.model.ae.User;
import com.ossys.ae.model.utils.Utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class UserUnitTest {

	@Test
	public void testDefaultValues() {
		User user = new User();
		assertEquals(null, user.getId());
		assertEquals("", user.getUsername());
		assertEquals("", user.getEmail());
		assertEquals("", user.getPassword());
		assertEquals(null, user.getFirstName());
		assertEquals(null, user.getLastName());
	}

	@Test
	public void testIdSetter() {
		User user = new User();

	}

	@Test
	public void testUsernameSetter() {
		User _user = new User();
		String username = Utils.generateRandomString(10, 10000);
		_user.setUsername(username);
		assertEquals("setUsername() did not allow us to set an expected acceptable value", username, _user.getUsername());

		_user = new User();
		_user.setUsername(null);
		assertNotNull("username is a required attribute and should not be nullable.", _user.getUsername());
	}

	@Test
	public void testEmailSetter() {
		User _user = new User();
		String email = Utils.generateRandomEmail();
		_user.setEmail(email);
		assertEquals("setEmail() did not allow us to set an expected acceptable value", email, _user.getEmail());

		_user = new User();
		_user.setEmail(null);
		assertNotNull("email is a required attribute and should not be nullable.", _user.getEmail());
	}

	@Test
	public void testPasswordSetter() {
		User _user = new User();
		String password = Utils.generateRandomString(5, 20);
		_user.setPassword(password);
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-512");
			md.update(password.getBytes("UTF-8"));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			fail();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			fail();
		}
		assertEquals("setPassword() did not allow us to set an expected acceptable value", Utils.toHexString(md.digest()), _user.getPassword());

		_user = new User();
		_user.setPassword(null);
		assertNotNull("password is a required attribute and should not be nullable.", _user.getPassword());
	}

	@Test
	public void testFirstNameSetter() {
		User _user = new User();
		String first_name = Utils.generateRandomString(10, 10000);
		_user.setFirstName(first_name);
		assertEquals("setFirstName() did not allow us to set an expected acceptable value", first_name, _user.getFirstName());
	}

	@Test
	public void testLastNameSetter() {
		User _user = new User();
		String last_name = Utils.generateRandomString(10, 10000);
		_user.setLastName(last_name);
		assertEquals("setLastName() did not allow us to set an expected acceptable value", last_name, _user.getLastName());
	}

}