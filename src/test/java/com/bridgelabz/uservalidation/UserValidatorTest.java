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
	@Test
	public void givenLastName_WhenWithSpecialCharacters_ShouldReturnFalse() 
	{
			
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateName("Emm@");
		Assert.assertFalse(isValid);
		
	}
	@Test
	public void givenLastName_WhenContainsNumbers_ShouldReturnFalse() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateName("willson123");
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenLastName_WhenContainsSpecialCharacters_ShouldReturnFalse() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateName("Willson@#");
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenEmail_WhenInValid_ShouldReturnFalse() 
	{
			
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateEMail("abcgmail.com");
		Assert.assertFalse(isValid);
		
	}
	
	@Test
	public void givenPhoneNumber_WhenValid_ShouldReturnTrue() 
	{
			
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePhoneNumber("91 9191123498");
		Assert.assertTrue(isValid);
		
	}
	
	@Test
	public void givenPhoneNumber_WhenInValid_ShouldReturnFalse() 
	{
			
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePhoneNumber("123456789");
		Assert.assertFalse(isValid);
		
	}
	
	
	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() 
	{
			
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePassword("Abc12@we3");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenPassword_WhenLessThanEightCharacters_ShouldReturnFalse()
	{
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePassword("A3bc1@");
		Assert.assertFalse(isValid);
		
	}
	
	@Test
	public void givenPassword_WhenNoUpperCaseLetters_ShouldReturnFalse()
	{
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePassword("azaz3bc1@");
		Assert.assertFalse(isValid);
		
	}
	@Test
	public void givenPassword_WhenNoNumbers_ShouldReturnFalse()
	{
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePassword("Abcdef@ghij");
		Assert.assertFalse(isValid);
		
	}
	@Test
	public void givenPassword_WhenNoSpecialCharacters_ShouldReturnFalse()
	{
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePassword("Abc123456av");
		Assert.assertFalse(isValid);
		
	}
	@Test
	public void givenPassword_WhenMoreThanOneSpecialCharacters_ShouldReturnFalse()
	{
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePassword("Abc12345@@@");
		Assert.assertFalse(isValid);
		
	}
	

}