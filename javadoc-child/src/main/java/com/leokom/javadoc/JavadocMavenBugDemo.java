package com.leokom.javadoc;

import org.springframework.security.BadCredentialsException;

public class JavadocMavenBugDemo {
	/**
	 * @throws BadCredentialsException
	 * @param args unused
	 */
	public static void main(String[] args) {
		throw new BadCredentialsException("Demo");
	}
}
