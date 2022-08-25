package com.automation.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automation.GenericUtils.DriverUtils;
import com.automation.GenericUtils.PropertyReader;

public class BaseTest {
	@BeforeMethod
	public void Precondition() throws FileNotFoundException, IOException
	{
		{
			DriverUtils.createDriver();
			PropertyReader.initProperty();
		}
		
	}
	
	/*@AfterMethod
	public void Postcondition()
	{
		{
			DriverUtils.getDriver().close();
		}
		
	}*/

}
