package com.wildstartech.wfa.dao.resources;

import java.util.ListResourceBundle;

public class AuthenticationException extends ListResourceBundle {
	static final Object[][] contents = {
	   // BEGIN TEXT LOCALIZATION
	   { "1",
		 "Authentication for \"{1}\" failed." }
	   // END TEXT LOCALIZATION
	};

	@Override
	protected Object[][] getContents() {
		return contents;
	}

}
