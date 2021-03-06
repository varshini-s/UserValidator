package com.bridgelabz.uservalidation;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.bridgelabz.uservalidation.UserValidatorException.ExceptionType;

public class UserValidatorTest 
{


	public void givenFirstName_WhenProper_ShouldReturnTrue() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateName.validate("Emma");
		Assert.assertTrue(isValid);

	}
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateName.validate("Em");
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenFirstName_WhenWithSpecialCharacters_ShouldReturnFalse() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateName.validate("Emm@");
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenFirstName_WhenContainsNumbers_ShouldReturnFalse() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateName.validate("Emma123");
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenFirstName_WhenNull_ShouldThrowException() 
	{

		UserValidator userValidator = new UserValidator();

		try 
		{
			userValidator.validateName.validate(null);

		} catch (UserValidatorException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_NULL ,e.type);
		}
	}
	@Test
	public void givenFirstName_WhenEmpty_ShouldThrowException() 
	{

		UserValidator userValidator = new UserValidator();

		try 
		{
			userValidator.validateName.validate("");

		} catch (UserValidatorException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_EMPTY ,e.type);
		}
	}



	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateName.validate("Wilson");
		Assert.assertTrue(isValid);

	}
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateName.validate("Em");
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenLastName_WhenWithSpecialCharacters_ShouldReturnFalse() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateName.validate("Emm@");
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenLastName_WhenContainsNumbers_ShouldReturnFalse() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateName.validate("willson123");
		Assert.assertFalse(isValid);

	}

	@Test
	public void givenLastName_WhenNull_ShouldThrowException() 
	{
		UserValidator userValidator = new UserValidator();

		try 
		{

			userValidator.validateName.validate(null);

		} catch (UserValidatorException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_NULL ,e.type);
		}
	}
	@Test
	public void givenLastName_WhenEmpty_ShouldThrowException() 
	{

		UserValidator userValidator = new UserValidator();

		try 
		{
			userValidator.validateName.validate("");

		} catch (UserValidatorException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_EMPTY ,e.type);
		}
	}

	
	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateEMail.validate("abc@gmail.com");
		Assert.assertTrue(isValid);

	}
	@Test
	public void givenEmail_WhenInValid_ShouldReturnFalse() 
	{
			
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateEMail.validate("abcgmail.com");
		Assert.assertFalse(isValid);
		
	}

	
	@Test
	public void givenEmail_WhenNull_ShouldThrowException() 
	{

		UserValidator userValidator = new UserValidator();

		try 
		{

			userValidator.validateEMail.validate(null);

		}
		catch (UserValidatorException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_NULL ,e.type);
		}
	}
	@Test
	public void givenEmail_WhenEmpty_ShouldThrowException() 
	{

		UserValidator userValidator = new UserValidator();

		try 
		{
			userValidator.validateEMail.validate("");

		} catch (UserValidatorException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_EMPTY ,e.type);
		}
	}


	
	@Test
	public void givenPhoneNumber_WhenValid_ShouldReturnTrue() 
	{
			
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePhoneNumber.validate("91 9191123498");
		Assert.assertTrue(isValid);
		
	}
	
	@Test
	public void givenPhoneNumber_WhenInValid_ShouldReturnFalse() 
	{
			
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePhoneNumber.validate("123456789");
		Assert.assertFalse(isValid);
		
	}
	
	@Test
	public void givenPhoneNumber_WhenNull_ShouldThrowException() 
	{

		UserValidator userValidator = new UserValidator();

		try 
		{

			userValidator.validatePhoneNumber.validate(null);

		}
		catch (UserValidatorException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_NULL ,e.type);
		}
	}

	@Test
	public void givenPhoneNumber_WhenEmpty_ShouldThrowException() 
	{

		UserValidator userValidator = new UserValidator();

		try 
		{
			userValidator.validatePhoneNumber.validate("");

		} catch (UserValidatorException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_EMPTY ,e.type);
		}
	}

	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() 
	{
			
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePassword.validate("Abc12@we3");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenPassword_WhenLessThanEightCharacters_ShouldReturnFalse()
	{
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePassword.validate("A3bc1@");
		Assert.assertFalse(isValid);
		
	}
	
	@Test
	public void givenPassword_WhenNoUpperCaseLetters_ShouldReturnFalse()
	{
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePassword.validate("azaz3bc1@");
		Assert.assertFalse(isValid);
		
	}
	@Test
	public void givenPassword_WhenNoNumbers_ShouldReturnFalse()
	{
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePassword.validate("Abcdef@ghij");
		Assert.assertFalse(isValid);
		
	}
	@Test
	public void givenPassword_WhenNoSpecialCharacters_ShouldReturnFalse()
	{
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePassword.validate("Abc123456av");
		Assert.assertFalse(isValid);
		
	}
	@Test
	public void givenPassword_WhenMoreThanOneSpecialCharacters_ShouldReturnFalse()
	{
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validatePassword.validate("Abc12345@@@");
		Assert.assertFalse(isValid);
		
	}
	@Test
	public void givenPassword_WhenNull_ShouldThrowException() 
	{

		UserValidator userValidator = new UserValidator();

		try 
		{
			userValidator.validatePassword.validate(null);

		}
		catch (UserValidatorException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_NULL ,e.type);
		}
	}
	
	@Test
	public void givenPassword_WhenEmpty_ShouldThrowException() 
	{

		UserValidator userValidator = new UserValidator();

		try 
		{
			userValidator.validatePassword.validate("");

		} catch (UserValidatorException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_EMPTY ,e.type);
		}
	}



}