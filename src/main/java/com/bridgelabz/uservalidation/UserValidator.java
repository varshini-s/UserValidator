package com.bridgelabz.uservalidation;

import java.util.regex.Pattern;

import com.bridgelabz.uservalidation.UserValidatorException.ExceptionType;

public class UserValidator 
{

	private static final String NAME_PATTERN="^[A-Z][a-z]{2,}$";
	private static final String EMAIL_ID_PATTERN="^[a-z0-9]+([+[.]_-][a-z0-9]+){0,1}@[a-z0-9]+[.][a-z]{2,4}([.][a-z]{2,4}){0,1}$";
	private static final String PHONE_NUMBER_PATTERN="^[0-9]{2}[ ][0-9]{10}$";
	private static final String PASSWORD_PATERN="^(?=.*[0-9])(?=.*[A-Z])(?=.{8,}$)[0-9a-zA-Z]*[@#$%][0-9a-zA-Z]*$";	

	@FunctionalInterface
	interface ValidationIF
	{
		boolean validate(String stringToValidate) throws UserValidatorException;


	}

	ValidationIF validateName = name->{try
		{
			if(name.isEmpty())
			{
				throw new UserValidatorException(ExceptionType.ENTERED_EMPTY,"Please enter valid Name");
			}
			else
			{		
				Pattern pattern = Pattern.compile(NAME_PATTERN);
				return pattern.matcher(name).matches();
	
			}

		}
		catch (NullPointerException e) 
		{
			throw new UserValidatorException(ExceptionType.ENTERED_NULL,"Please enter valid Name");
		}
	};


	ValidationIF validateEMail= eMailID->{try
		{
			if(eMailID.isEmpty())
			{
				throw new UserValidatorException(ExceptionType.ENTERED_EMPTY,"Please enter valid mail");
			}
			else
			{		
				Pattern pattern = Pattern.compile(EMAIL_ID_PATTERN);
				return pattern.matcher(eMailID).matches();
	
			}
	
	
		}
		catch (NullPointerException e) 
		{
			throw new UserValidatorException(ExceptionType.ENTERED_NULL,"Please enter valid mail");
		}
	};


	ValidationIF validatePhoneNumber=phoneNumber->{try
		{
			if(phoneNumber.isEmpty())
			{
				throw new UserValidatorException(ExceptionType.ENTERED_EMPTY,"Please enter valid phone number");
			}
			else
			{		
				Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
				return pattern.matcher(phoneNumber).matches();
	
			}

		}
		catch (NullPointerException e) 
		{
			throw new UserValidatorException(ExceptionType.ENTERED_NULL,"Please enter valid phone number");
		}
		
	};
	
	
	public boolean validatePassword(String passWord) throws UserValidatorException
	{
		try
		{
			if(passWord.isEmpty())
			{
				throw new UserValidatorException(ExceptionType.ENTERED_EMPTY,"Please enter valid password");
			}
			else
			{		
				Pattern pattern = Pattern.compile(PASSWORD_PATERN);
				return pattern.matcher(passWord).matches();

			}


		}

		catch (NullPointerException e) 
		{
			throw new UserValidatorException(ExceptionType.ENTERED_NULL,"Please enter valid password");
		}

	}


}
