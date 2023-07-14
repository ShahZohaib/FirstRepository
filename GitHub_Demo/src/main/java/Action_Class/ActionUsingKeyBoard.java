package Action_Class;



import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;


import Main.DriverClass;

public class ActionUsingKeyBoard extends DriverClass{
	public static void main(String[] args) {
		
		
		driver("https://demoqa.com/text-box");
		
		By name = By.xpath("//input[@id=\"userName\"]");
		WebElement n = d.findElement(name);
		n.click();
		n.sendKeys("ZtoH");
		
		By email = By.xpath("//input[@id=\"userEmail\"]");
		WebElement e = d.findElement(email);
		e.click();
		e.sendKeys("ZtoH@gmail.com");
		
		WebElement address =d.findElement(By.xpath("//textarea[@id=\"currentAddress\"]"));
		address.sendKeys("ZtoHIndia,attapur");
		address.sendKeys(Keys.CONTROL+"A");
		address.sendKeys(Keys.CONTROL+"C");
		By per_add = By.xpath("//textarea[@id=\"permanentAddress\"]");
		WebElement permanent = d.findElement(per_add);
		permanent.sendKeys(Keys.CONTROL+"V");
		
   


		
	}
}
