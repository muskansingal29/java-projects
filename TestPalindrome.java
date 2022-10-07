//Write a program for to check a palindrome string.
//Write test cases for 4 different parameters (use @parametrizedTest annotaion).
//author muskansingal
//test class for checking the string is palindrome aur not
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;

public class TestPalindrome {
	@Test
	
	/*public void isPalindrome()
	{
	
		assertEquals(true,Palindrome.isPalindrome("radar"));
	}*/
	
	//assigning 4 String values to check  the string is palindrome or not
		@DisplayName(value="check String palindrome")
		@ParameterizedTest
		@ValueSource(strings  = {"mom","dad","zoz","radar "})
		public void isPalindromeTest(String str)
		{
			assertTrue(Palindrome.isPalindrome(str));
		}
	}

