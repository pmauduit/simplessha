package org.georchestra.simplessha;

import org.springframework.security.authentication.encoding.LdapShaPasswordEncoder;

public class SimpleSsha {

	public String algorithm = "SHA";
	
	public static byte[] computeSSHA(byte[] clearTextPassword) {
		
		
		return clearTextPassword;
	}
	
	public static void main(String[] argv) {
		System.out.println("Encrypting password [blah] ...");
		LdapShaPasswordEncoder lspe = new LdapShaPasswordEncoder();
		
		// blah -> {SSHA}kKUzivwiQHc0iB7I0AC5r4dmWBRrNmiY
		String encrypted = lspe.encodePassword("blah",
				String.valueOf(System.currentTimeMillis()).getBytes());
		System.out.println(encrypted);
		
		System.out.println("Checking if password is valid ...");
		boolean check = lspe.isPasswordValid(encrypted, "blah", null);
		if (check) {
			System.out.println("Password correctly encoded.");
		} else {
			System.out.println("Unable to check password.");
			
		}
	}
		
}
