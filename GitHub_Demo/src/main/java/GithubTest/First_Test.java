package GithubTest;

import org.testng.annotations.*;

public class First_Test {
	@BeforeMethod
	public void beforetest_method()
	{
		System.out.println("Before Method");
	}	
	@Test
	public  void test_Method1()
	{
		System.out.println("First Test Method1");
	}
	@Test
	public  void test_Method2()
	{
		System.out.println("First Test Method2");
	}
	@Test
	public  void test_Method3()
	{
		System.out.println("First Test Method3");
	}
	@AfterMethod
	public void aftetest_Method()
	{
		System.out.println("After Method");
	}
	
	
}
