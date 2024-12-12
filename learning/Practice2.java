package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.cssSelector("div[class = 'forgot-pwd-container']")).click();
		Thread.sleep(2000);
		String password = getPassword(driver);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahulshetty");
		driver.findElement(By.xpath("//*[@name='inputPassword']")).sendKeys(password);
		driver.findElement(By.cssSelector("button[class = 'go-to-login-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class = 'submit signInBtn']")).click();
		
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.xpath("//*[text()='You are successfully logged in.']")).getText());
		
			
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.cssSelector("button[class = 'reset-pwd-btn']")).click();
		Thread.sleep(1000);
		String password = driver.findElement(By.cssSelector("p[class = 'infoMsg']")).getText().split("'")[1].split("'")[0];
		return password;
				
	}

}
