package com.hp.utils;

import org.thymeleaf.util.StringUtils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * 加密工具
 * @author Administrator
 *
 */
public class EncryptionUtils {

	public static String encryptMD5(String password) {
        MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
			md.update(password.getBytes());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
        return new BigInteger(1, md.digest()).toString(16);
    }
	
	public static void main(String[] args) {

		System.out.println(encryptMD5("123"));

	}
}
