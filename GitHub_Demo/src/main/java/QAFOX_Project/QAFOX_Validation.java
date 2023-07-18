package QAFOX_Project;

public class QAFOX_Validation {
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
			System.out.println("Required Message is Displayed");
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
	
	
}
