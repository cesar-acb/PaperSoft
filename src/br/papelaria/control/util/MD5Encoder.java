package br.papelaria.control.util;

import java.security.*;
import java.math.*;

public class MD5Encoder 
{
	public String MD5Encode(String original)
	{
		try
		{
			MessageDigest m=MessageDigest.getInstance("MD5");
			m.update(original.getBytes(),0,original.length());

			return new BigInteger(1,m.digest()).toString(16); 
		}
		catch (NoSuchAlgorithmException e)
		{
			return null;
		}
	}
}