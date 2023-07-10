package QAFOX_Project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClass {
	static WebDriver d;
	public static void driver()
	{
		d=new ChromeDriver();
		d.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
}
