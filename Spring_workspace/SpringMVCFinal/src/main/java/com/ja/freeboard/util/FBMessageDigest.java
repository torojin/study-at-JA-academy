package com.ja.freeboard.util;

import java.security.MessageDigest;

public class FBMessageDigest {
	public static String digest(String value) {
		String hashCode = null;
		try {			
			StringBuilder sb = new StringBuilder();
			
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
			messageDigest.reset();
			messageDigest.update((value+"sksldjfsk@@@!#").getBytes());
			
			byte[] chars = messageDigest.digest();
			
			for(int i = 0; i < chars.length; i++) {
				
				String tmp = Integer.toHexString(chars[i]& 0xff);
				
				//이렇게 쓰면 안된다. / 속도가 아주 느려진다. / String으로 하면안되고 String buffer or StringBuilder 로 처리
				//hashCode += tmp;
				
				if(tmp.length() == 1) {
					sb.append("0");
				}
				//자료구조에 쌓겠다
				sb.append(tmp);
			}
			hashCode = sb.toString();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
			return hashCode;
		
	}
}
