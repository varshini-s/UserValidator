package com.bridgelabz.uservalidation;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest 
{

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateName("Emma");
		Assert.assertTrue(isValid);

	}
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateName("Em");
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenFirstName_WhenWithSpecialCharacters_ShouldReturnFalse() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateName("Emm@");
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenFirstName_WhenContainsNumbers_ShouldReturnFalse() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateName("Emma123");
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenFirstName_WhenContainsSpecialCharacters_ShouldReturnFalse() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateName("Emma@#");
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() 
	{
			
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateName("Wilson");
		Assert.assertTrue(isValid);
		
	}
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() 
	{
			
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateName("Em");
		Assert.assertFalse(isValid);
		
	}
	

	

}