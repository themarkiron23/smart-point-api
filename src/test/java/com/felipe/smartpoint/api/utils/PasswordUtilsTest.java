package com.felipe.smartpoint.api.utils;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.felipe.smartpoint.api.utils.PasswordUtils;

public class PasswordUtilsTest {
	
	private static final String SENHA = "admin";
	private final BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();

	@Test
	public void testSenhaNula() throws Exception {
		assertNull(PasswordUtils.gerarBCrypt(null));
	}
	
	@Test
	public void testGerarHashSenha() throws Exception {
		String hash = PasswordUtils.gerarBCrypt(SENHA);
		System.out.println(hash);
		
		assertTrue(bCryptEncoder.matches(SENHA, hash));
	}

}
