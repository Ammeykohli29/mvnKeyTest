package TestCases;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
	public static Logger log = Logger.getLogger("devpinoyLogger");
	@BeforeTest
	public void OpenDBConnection()
	{
		System.out.println("Open the DB connection");
		log.debug("Database Open");
	}
	
	@BeforeTest
	public void OpenBrowser()
	{
		System.out.println("open the browser");
		log.debug("ChromeBrowser Launch");
	}
	
	@Test(priority = 1)
	public void doSignUp()
	{
		System.out.println("Sign Up into the application");
		log.debug("Application signup");
	}
	@Test(priority = 2)
	public void doLogin()
	{
		System.out.println("fail");
		log.debug("Enter into website");
		Assert.fail();
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Close the browser");
		log.debug("ChromeBrowser Closed");
	}
	
	@AfterTest
	public void CloseDBConnection()
	{
		System.out.println("Close the DB connection");
		log.debug("Database closed");
	}

}
