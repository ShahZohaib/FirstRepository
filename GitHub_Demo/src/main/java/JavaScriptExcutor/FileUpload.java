package JavaScriptExcutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload 
{
	public static void main(String[] args) throws AWTException {
		WebDriver d =new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/upload");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		By file = By.xpath("//input[@id=\"file-upload\"]");
		WebElement upload_file = d.findElement(file);
		upload_file.sendKeys("C:\\UploadDoc\\zohaib.pdf");
		upload_file.submit();
		
		
//		 Robot rb = new Robot();
//		 
//	    // copying File path to Clipboard
//	    StringSelection str = new StringSelection("C:\\UploadDoc\\zohaib.pdf");
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//	 
//	     // press Contol+V for pasting
//	     rb.keyPress(KeyEvent.VK_CONTROL);
//	     rb.keyPress(KeyEvent.VK_V);
//	 
//	    // release Contol+V for pasting
//	    rb.keyRelease(KeyEvent.VK_CONTROL);
//	    rb.keyRelease(KeyEvent.VK_V);
//	 
//	    // for pressing and releasing Enter
//	    rb.keyPress(KeyEvent.VK_ENTER);
//	    rb.keyRelease(KeyEvent.VK_ENTER);
	}
}
