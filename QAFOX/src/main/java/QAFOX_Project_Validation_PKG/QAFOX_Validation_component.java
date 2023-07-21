package QAFOX_Project_Validation_PKG;

import java.util.List;

import org.openqa.selenium.WebElement;
import QAFOX_Project_XPATH_PKG.Dashboard_Component;

public class QAFOX_Validation_component {
	public static void Validate_Data(boolean b) throws Exception
	{
		if(!b)
		{
			throw new Exception("Wrong Data Selected");
		}
		else
		{
			System.out.println("Valid Data Selected");
		}
	}
	public static void Check_msg_displayed(boolean b) throws Exception
	{
		if(!b)
		{
			throw new Exception("Msg Not Displayed");
		}
		else
		{
			System.out.println("Message is Displayed");
		}
	}
	public static void Check_element_displayed(boolean b) throws Exception
	{
		if(!b)
		{
			throw new Exception("Elements Not Displayed");
		}
		else
		{
			System.out.println(" Elements Displayed");
		}
	}
	public static void Check_img_displayed(boolean b) throws Exception
	{
		if(!b)
		{
			throw new Exception("Msg Not Displayed");
		}
		else
		{
			System.out.println("Image is Displayed");
		}
	}
	public static void check_equal(String act,String exp) throws Exception
	{
		if(!act.equals(exp))
		{
			throw new Exception("act not equal exp");
		}
		else
		{
			System.out.println("Both are equal");
		}
	}
	
	public static void Check_table_displayed(boolean b) throws Exception
	{
		if(!b)
		{
			throw new Exception("table Not Displayed");
		}
		else
		{
			System.out.println("Data Box is Displayed");
		}
	}
	public static void check_list_equal(String act) throws Exception
	{
		List<WebElement>li = Dashboard_Component.s.getAllSelectedOptions();
		  for(WebElement e:li)
		  {
			  String s = e.getText();
			  System.out.println(s);
			  if(!s.equals(act))
			  {
				  throw new Exception("Given Data is not same");
			  }
			  else
			  {
				  System.out.println("Data is Same");
			  }
		  }
	}
	public static void check_Clicked(boolean b) throws Exception
	{
		if(!b)
		{
			throw new Exception("Not Clicked");
		}
		else
		{
			System.out.println("Clicked Successfully");
		}
	}
	public static void check_data_equal(String act,String exp) throws Exception
	{
		if(exp.contains(act))
		{
			System.out.println("Both are equal");
			
		}
		else
		{
			throw new Exception("act not equal exp");
		}
	}

}
