package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("input[class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("Harshitha");
		
		driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("abcd@xyz.com");
		
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("Welcome@1234");
		
		driver.findElement(By.id("exampleCheck1")).click();
		System.out.println((driver.findElement(By.id("exampleCheck1")).isSelected()));
		
		WebElement dropdown = driver.findElement(By.cssSelector("#exampleFormControlSelect1"));		
		Select genderDD = new Select(dropdown);
		genderDD.selectByIndex(1);
		
		driver.findElement(By.cssSelector("input[class='form-check-input'][value='option1']")).click();
		
		driver.findElement(By.cssSelector("[name='bday']")).sendKeys("27091996");
		
		driver.findElement(By.cssSelector("[class='btn btn-success']")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.cssSelector("[class='alert alert-success alert-dismissible']")).getText());
		

	}

}
