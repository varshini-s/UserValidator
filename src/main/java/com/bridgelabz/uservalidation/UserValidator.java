package com.bridgelabz.uservalidation;

import java.util.regex.Pattern;

public class UserValidator 
{

	private static final String NAME_PATTERN="^[A-Z][a-z]{2,}$";
	
	
	public boolean validateName(String name)
	{
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		return pattern.matcher(name).matches();
	}
	
	
	
	
}
