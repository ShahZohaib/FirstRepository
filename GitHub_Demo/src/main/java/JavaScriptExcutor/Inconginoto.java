package JavaScriptExcutor;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Inconginoto {
	public static void main(String[] args) {
		ChromeOptions d = new ChromeOptions();
		d.addArguments("--incognito");
		WebDriver dr = new ChromeDriver(d);
		dr.get("https:\\www.google.com");
		dr.manage().window().maximize();
		
		
	}
}
