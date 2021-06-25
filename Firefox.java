package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class  Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.gecko.driver", "C://Work//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		//System.out.println("vinita");
		
		
		driver.get("https://integrateindia.in/");
		driver.getTitle();
		driver.findElement(By.xpath("//a[normalize-space()='LOGIN']"));
		driver.findElement(By.xpath("//input[@id='user_UserName']"));
		driver.findElement(By.xpath("//input[@id='user_Password']"));
		

	}

}
