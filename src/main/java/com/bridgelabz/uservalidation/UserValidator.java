package com.bridgelabz.uservalidation;

import java.util.regex.Pattern;

public class UserValidator 
{

	private static final String NAME_PATTERN="^[A-Z][a-z]{2,}$";
	private static final String EMAIL_ID_PATTERN="^[a-z0-9]+([+[.]_-][a-z0-9]+){0,1}@[a-z0-9]+[.][a-z]{2,4}([.][a-z]{2,4}){0,1}$";
	private static final String PHONE_NUMBER_PATTERN="^[0-9]{2}[ ][0-9]{10}$";
	private static final String PASSWORD_PATERN="^(?=.*[0-9])(?=.*[A-Z])(?=.{8,}$)$";
	
	
	public boolean validateName(String name)
	{
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		return pattern.matcher(name).matches();
	}
	public boolean validateEMail(String eMailID)
	{
		Pattern pattern = Pattern.compile(EMAIL_ID_PATTERN);
		return pattern.matcher(eMailID).matches();
	}
	public boolean validatePhoneNumber(String phoneNumber)
	{
		Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
		return pattern.matcher(phoneNumber).matches();
	}
	public boolean validatePassword(String passWord)
	{
		Pattern pattern = Pattern.compile(PASSWORD_PATERN);
		return pattern.matcher(passWord).matches();
	}
	
	
}
