package TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testAssertions {

	@Test
	public void match()
	{
		SoftAssert SA = new SoftAssert();
		System.out.println("Asserts start");
		System.out.println("Matching the two screens below");
		SA.assertEquals(false, true,"matching two screens");
		
		System.out.println("Matching two input boxes");
		SA.assertEquals(false, true,"matching two input boxes");

		System.out.println("CHecking the visibility of an element");
		SA.assertEquals(false, true);
		System.out.println("Asserts ends");
		
		SA.assertAll();
	}

}
