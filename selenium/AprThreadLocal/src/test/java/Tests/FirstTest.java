package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Library.TLDriverFactory;

public class FirstTest extends TestBase{
	
	@Test
	public void GoogleTest1(){
		System.out.println("GoogleTest1 test case started ---" + Thread.currentThread().getId());
		TLDriverFactory.getTLDriver().get("http://www.google.com");
		Assert.assertEquals(TLDriverFactory.getTLDriver().getTitle(), "Google");
		System.out.println("GoogleTest1 test case ended ---" + Thread.currentThread().getId());

	}
	
	@Test
	public void GoogleTest2(){
		System.out.println("GoogleTest2 test case started ---" + Thread.currentThread().getId());
		TLDriverFactory.getTLDriver().get("http://www.google.com");
		Assert.assertEquals(TLDriverFactory.getTLDriver().getTitle(), "Google");
		System.out.println("GoogleTest2 test case ended ---" + Thread.currentThread().getId());

	}
	
	@Test
	public void GoogleTest3(){
		System.out.println("GoogleTest3 test case started ---" + Thread.currentThread().getId());
		TLDriverFactory.getTLDriver().get("http://www.google.com");
		Assert.assertEquals(TLDriverFactory.getTLDriver().getTitle(), "Google");
		System.out.println("GoogleTest3 test case ended ---" + Thread.currentThread().getId());

	}
	
	@Test
	public void GoogleTest4(){
		System.out.println("GoogleTest4 test case started ---" + Thread.currentThread().getId());
		TLDriverFactory.getTLDriver().get("http://www.google.com");
		Assert.assertEquals(TLDriverFactory.getTLDriver().getTitle(), "Google");
		System.out.println("GoogleTest4 test case ended ---" + Thread.currentThread().getId());

	}
	
	
	
	
	

}
