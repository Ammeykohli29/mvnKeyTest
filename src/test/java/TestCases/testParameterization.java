package TestCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testParameterization {
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");

	@Test(dataProvider="getData")
	public void testData(String username,String password)
	{

		System.out.println("The first User name is "+ username);

		System.out.println("The first User name password is "+ password);
	}
	
	
	@DataProvider
	public static String[][] getData()
	{
		String[][] data = new String[3][2];
		data[0][0] = "hemant";
		data[0][1] = "dfdsfsaf";
		data[1][0] = "Amit";
		data[1][1] = "sffdssds";
		data[2][0] = "Aman";
		data[2][1] = "dsfdsfsf";
		return data;
		
	}
}
