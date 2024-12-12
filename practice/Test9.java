package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		WebElement text = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(text).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		a.moveToElement(text).keyDown(Keys.ENTER).build().perform();
		
		a.moveToElement(move).build().perform();
		
		
		
		

	}

}
