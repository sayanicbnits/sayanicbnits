package com.cbnits.CBNITS_TRADE.ServicePackage;

import java.util.List;

import com.cbnits.CBNITS_TRADE.EntityPackage.EntityClass;

public interface ServiceInterface {
	public int result();
	public byte[] getNextSalt();	
	public byte[] hash(char[] password, byte[] salt);
	public String md5(String input);
	public void update1(String user_id, String hashedpassst, String s);
	public void authenticate(String user, String pass);


}
