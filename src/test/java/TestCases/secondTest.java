package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class secondTest {
	
	@Test
	public void textCompare()
	{
		String expectedString = "gmail.com";
		String actualString = "facebook.com";
		/*
		 * if(expectedString.equals(actualString)) {
		 * System.out.println("Strings are matching"); } else {
		 * System.out.println("Strings are not matching"); }
		 */
		
		Assert.assertEquals(actualString,expectedString); }
		}
