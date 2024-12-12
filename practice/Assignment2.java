package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		String username = driver.findElement(By.xpath("//i[text()='rahulshettyacademy']")).getText();
		String password = driver.findElement(By.xpath("//i[text()='learning']")).getText();

		driver.findElement(By.cssSelector("#username")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='user']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		Thread.sleep(1000);
		
		WebElement newDropDown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropDown = new Select(newDropDown);
		dropDown.selectByIndex(2);
		
		driver.findElement(By.cssSelector("#terms")).click();
		driver.findElement(By.cssSelector("#signInBtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='my-4']")));
		
		List<WebElement> items = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for(WebElement addItems : items) {
			
			System.out.println(addItems.getText());
			addItems.click();
			Thread.sleep(1000);
		}
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		
				
	}

}
