package PlayWright_Practice;



import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Demo 
{	
  public static void main(String[] args) 
  {
  Playwright pw = Playwright.create();
  Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
  
  Page p = bw.newPage();

  p.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


  Locator user = p.locator("//input[@name='username']");
  user.type("Admin");
		
  Locator pass = p.locator("//input[@name='password']");
  pass.type("admin123");
		
  Locator login = p.locator("//button[@type='submit']");
  login.click();	
		
	}
}
