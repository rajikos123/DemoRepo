package Banking;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.AfterTest;

public class AppTest {

	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
		
	}
	@Test
	public void Demo()
	{
		System.out.println("hello");//automation
		AssertJUnit.assertTrue(false);
	}
	@AfterSuite
	
	public void afSyite()
	{
		System.out.println("I am the no 1 from last ");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}



}