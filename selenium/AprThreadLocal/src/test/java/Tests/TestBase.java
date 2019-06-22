package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Library.TLDriverFactory;

public class TestBase {
	
	
	
	@BeforeMethod
	@Parameters(value={"browser"})
	public void setUpTest(String browser){
		TLDriverFactory.setTLDriver(browser);
	}
	
	@AfterMethod
	public synchronized void tearDown(){
		TLDriverFactory.getTLDriver().quit();
	}
	
	

}
