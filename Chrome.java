package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//System.out.println("vinita");
		
		
		driver.get("https://integrateindia.in/");
		System.out.println(driver.getTitle());
	//	driver.findElement(By.xpath("//a[normalize-space()='LOGIN']"));
	//findElement(By.xpath("//input[@id='user_UserName']"));
	//	driver.findElement(By.xpath("//input[@id='user_Password']"));
		
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        
       driver.get("https://dev.azure.com/");
       driver.navigate().back();
     //  driver.navigate().forward();
       driver.close(); // its close current browser (where u focus)
       driver.quit(); //its closed all the browser (open by selenium)
	}

}
