package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Library.TLDriverFactory;

public class SecondTest extends TestBase{
	
	@Test
	public void FacebookTest1(){
		System.out.println("FacebookTest1 test case started ---" + Thread.currentThread().getId());
		TLDriverFactory.getTLDriver().get("http://www.facebook.com");
		Assert.assertEquals(TLDriverFactory.getTLDriver().getTitle(), "Facebook – log in or sign up");
		System.out.println("FacebookTest1 test case ended ---" + Thread.currentThread().getId());

	}
	
	@Test
	public void FacebookTest2(){
		System.out.println("FacebookTest2 test case started ---" + Thread.currentThread().getId());
		TLDriverFactory.getTLDriver().get("http://www.facebook.com");
		Assert.assertEquals(TLDriverFactory.getTLDriver().getTitle(), "Facebook – log in or sign up");
		System.out.println("FacebookTest2 test case ended ---" + Thread.currentThread().getId());

	}
	
	
	
	
	

}
