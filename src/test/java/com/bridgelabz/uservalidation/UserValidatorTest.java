package com.bridgelabz.uservalidation;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserValidatorTest 
{

	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid;
		try 
		{
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserValidatorException.class);
			isValid = userValidator.validateName("Emma");
			Assert.assertTrue(isValid);
		} catch (UserValidatorException e) 
		{
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid;
		try 
		{
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserValidatorException.class);
			isValid = userValidator.validateName("Em");
			Assert.assertFalse(isValid);
		} catch (UserValidatorException e) 
		{
			e.printStackTrace();
		}

	}
	@Test
	public void givenFirstName_WhenWithSpecialCharacters_ShouldReturnFalse() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid;
		try 
		{
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserValidatorException.class);
			isValid = userValidator.validateName("Emma@@");
			Assert.assertFalse(isValid);
		} catch (UserValidatorException e) 
		{
			e.printStackTrace();
		}

	}
	@Test
	public void givenFirstName_WhenContainsNumbers_ShouldReturnFalse() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid;
		try 
		{
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserValidatorException.class);
			isValid = userValidator.validateName("Emma1234");
			Assert.assertFalse(isValid);
		} catch (UserValidatorException e) 
		{
			e.printStackTrace();
		}

	}
	@Test
	public void givenFirstName_WhenNull_ShouldThrowException() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid;
		try 
		{
			
			isValid = userValidator.validateName(null);
			
		} catch (UserValidatorException e) 
		{
			Assert.assertEquals("Please enter valid Name" , e.getMessage());
		}
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() 
	{
			
		UserValidator userValidator = new UserValidator();
		boolean isValid;
		try 
		{
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserValidatorException.class);
			isValid = userValidator.validateName("Willson");
			Assert.assertTrue(isValid);
		} catch (UserValidatorException e) 
		{
			e.printStackTrace();
		}
		
	}
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() 
	{
		UserValidator userValidator = new UserValidator();
		boolean isValid;
		try 
		{
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserValidatorException.class);
			isValid = userValidator.validateName("W");
			Assert.assertFalse(isValid);
		} catch (UserValidatorException e) 
		{
			e.printStackTrace();
		}
		
	}
	@Test
	public void givenLastName_WhenWithSpecialCharacters_ShouldReturnFalse() 
	{
			
		UserValidator userValidator = new UserValidator();
		boolean isValid;
		try 
		{
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserValidatorException.class);
			isValid = userValidator.validateName("Willson@@");
			Assert.assertFalse(isValid);
		} catch (UserValidatorException e) 
		{
			e.printStackTrace();
		}
		
	}
	@Test
	public void givenLastName_WhenContainsNumbers_ShouldReturnFalse() 
	{
		UserValidator userValidator = new UserValidator();
		boolean isValid;
		try 
		{
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserValidatorException.class);
			isValid = userValidator.validateName("Willson123");
			Assert.assertFalse(isValid);
		} catch (UserValidatorException e) 
		{
			e.printStackTrace();
		}

	}

	@Test
	public void givenLastName_WhenNull_ShouldThrowException() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid;
		try 
		{
			
			isValid = userValidator.validateName(null);
			
		} catch (UserValidatorException e) 
		{
			Assert.assertEquals("Please enter valid Name" , e.getMessage());
		}
	}
	public void givenEmail_WhenValid_ShouldReturnTrue() 
	{
			
		UserValidator userValidator = new UserValidator();
		boolean isValid;
		try 
		{
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserValidatorException.class);
			isValid = userValidator.validateEMail("abc@gmail.com");
			Assert.assertTrue(isValid);
		} catch (UserValidatorException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public void givenEmail_WhenInValid_ShouldReturnFalse() 
	{
			
		UserValidator userValidator = new UserValidator();
		boolean isValid;
		try 
		{
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserValidatorException.class);
			isValid = userValidator.validateEMail("abcgmail.com");
			Assert.assertFalse(isValid);
		} catch (UserValidatorException e) 
		{
			e.printStackTrace();
		}
		
	}
	@Test
	public void givenEmail_WhenNull_ShouldThrowException() 
	{

		UserValidator userValidator = new UserValidator();
		boolean isValid;
		try 
		{
			
			isValid = userValidator.validateEMail(null);
			
		} catch (UserValidatorException e) 
		{
			Assert.assertEquals("Please enter valid mail" , e.getMessage());
		}
	}
	
	@Test
	public void givenPhoneNumber_WhenValid_ShouldReturnTrue() 
	{
		UserValidator userValidator = new UserValidator();
		boolean isValid;
		try 
		{
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserValidatorException.class);
			isValid = userValidator.validatePhoneNumber("91 9191123498");
			Assert.assertTrue(isValid);
		} catch (UserValidatorException e) 
		{
			e.printStackTrace();
		}
	
		
	}
	
	@Test
	public void givenPhoneNumber_WhenInValid_ShouldReturnFalse() 
	{
		UserValidator userValidator = new UserValidator();
		boolean isValid;
		try 
		{
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserValidatorException.class);
			isValid = userValidator.validatePhoneNumber("123456789");
			Assert.assertFalse(isValid);
		} catch (UserValidatorException e) 
		{
			e.printStackTrace();
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
	

}