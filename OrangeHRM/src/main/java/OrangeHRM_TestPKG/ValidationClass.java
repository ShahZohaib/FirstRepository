package OrangeHRM_TestPKG;

public class ValidationClass {
	public static void Validate_text_msg_visible(boolean visible) throws Exception
	{
		if(!visible)
		{
			throw new Exception("Text Not Visible");
		}
		else
		{
			System.out.println("Text Visible");
		}
	}
}
