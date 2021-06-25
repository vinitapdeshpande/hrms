package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeIntegrateindia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//System.out.println("vinita");
		
		
		driver.get("https://integrateindia.in/");
		
	driver.findElement(By.xpath("/html/body/header/div/div/div/div/div/div[2]/div/a")).click();
	driver.findElement(By.xpath("//input[@id='user_UserName']")).sendKeys("vinita.deshpande@edisphere.com");
	driver.findElement(By.xpath("//input[@id='user_Password']")).sendKeys("Vinita@123");
	//driver.findElement(By.className(""//*[@id=\"Form\"]/div/div/div[6]/button")).click();
	driver.findElement(By.name("user.RememberMe")).click();
	//driver.findElement(By.xpath(" /*[@id='Form']/div/div/div[7]/p[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"Form\"]/div/div/div[6]/button")).click();
	//driver.findElement(By.xpath("//*[@id=\"Form\"]/div/div/div[2]/div/ul/li")).getText(); 
	
       driver.navigate().back();
     //  driver.navigate().forward();
     //  driver.close(); // its close current browser (where u focus)
     driver.quit(); //its closed all the browser (open by selenium)
	}

}
