package com.bridgelabz.uservalidation;

public class UserValidatorException extends Exception
{

	enum ExceptionType 
	{
		ENTERED_NULL, ENTERED_EMPTY
	}

	ExceptionType type;

	public UserValidatorException(ExceptionType type, String message) 
	{

		super(message);
		this.type = type;

	}

}
