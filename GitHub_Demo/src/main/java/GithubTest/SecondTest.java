package GithubTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class SecondTest {
	@BeforeMethod
	public void beforetest_method()
	{
		System.out.println("Before Method Second Test");
	}	
	@Test
	public void test_Method1()
	{
		System.out.println("Second Test Method1");
	}
	@Test
	public void test_Method2()
	{
		System.out.println("Second Test Method2");
	}
	@AfterMethod
	public void aftetest_Method()
	{
		System.out.println("After Method Second Test");
	}
}
