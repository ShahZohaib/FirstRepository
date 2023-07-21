package QAFOX_Project_Validation_PKG;

public class Validate_Cameras {
	public static void Validate_Page_Displayed(boolean displayed) throws Exception
	{
		if(!displayed)
		{
			throw new Exception("Page Not Displayed");
		}
		else
		{
			System.out.println("Page Displayed");
		}
	}
	
	public static void Validate_images_visible_in_format(boolean status) throws Exception
	{
		if(!status)
		{
			throw new Exception("Images not according to format");
		}
		else
		{
			System.out.println("Images according to format");
		}
	}
}
