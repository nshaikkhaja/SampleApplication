package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {

		String text = "Nayeem Shaik";
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.name("enter-name")).sendKeys(text);

		driver.findElement(By.cssSelector("#alertbtn")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

		Thread.sleep(2000);

		driver.findElement(By.name("enter-name")).sendKeys(text);

		driver.findElement(By.id("confirmbtn")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();

	}

}
