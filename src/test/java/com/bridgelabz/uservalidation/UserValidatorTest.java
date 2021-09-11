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
	public void givenFirstName_WhenNull_ShouldThrowException() 
	{

		UserValidator userValidator = new UserValidator();

		try 
		{
			userValidator.validateName(null);

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
			userValidator.validateName("");

		} catch (UserValidatorException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_EMPTY ,e.type);
		}
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
	public void givenLastName_WhenNull_ShouldThrowException() 
	{
		UserValidator userValidator = new UserValidator();

		try 
		{

			userValidator.validateName(null);

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
			userValidator.validateName("");

		} catch (UserValidatorException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_EMPTY ,e.type);
		}
	}

	
	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateEMail("abc@gmail.com");
		Assert.assertTrue(isValid);

	}
	@Test
	public void givenEmail_WhenInValid_ShouldReturnFalse() 
	{
			
		UserValidator userValidator = new UserValidator();
		boolean isValid=userValidator.validateEMail("abcgmail.com");
		Assert.assertFalse(isValid);
		
	}

	
	@Test
	public void givenEmail_WhenNull_ShouldThrowException() 
	{

		UserValidator userValidator = new UserValidator();

		try 
		{

			userValidator.validateEMail(null);

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
			userValidator.validateEMail("");

		} catch (UserValidatorException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_EMPTY ,e.type);
		}
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
	public void givenPhoneNumber_WhenNull_ShouldThrowException() 
	{

		UserValidator userValidator = new UserValidator();

		try 
		{

			userValidator.validatePhoneNumber(null);

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
			userValidator.validatePhoneNumber("");

		} catch (UserValidatorException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_EMPTY ,e.type);
		}
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
	@Test
	public void givenPassword_WhenNull_ShouldThrowException() 
	{

		UserValidator userValidator = new UserValidator();

		try 
		{
			userValidator.validatePassword(null);

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
			userValidator.validatePassword("");

		} catch (UserValidatorException e) 
		{
			Assert.assertEquals(ExceptionType.ENTERED_EMPTY ,e.type);
		}
	}



}