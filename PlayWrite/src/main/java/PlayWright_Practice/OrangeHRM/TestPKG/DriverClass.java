package PlayWright_Practice.OrangeHRM.TestPKG;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DriverClass {
	public static Page p;
	public static void driver(String url)
	{
		Playwright pw = Playwright.create();
		Browser bw= pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	    p = bw.newPage();
	    p.navigate(url);
	}
}
