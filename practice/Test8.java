package practice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test8 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String[] itemsNeeded= {"Cauliflower", "Beetroot", "Cucumber"};
		
		addItems(driver, itemsNeeded);		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		WebDriverWait wa = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wa.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".promoCode")));
		
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		
		
		
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {

		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));

		int j = 0;

		for (int i = 0; i < product.size(); i++) {

			String[] name = product.get(i).getText().split("-");

			String updatedName = name[0].trim();

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(updatedName)) {

				j++;

				driver.findElements(By.xpath("//div[@class = 'product-action']/button")).get(i).click();

				if (j == 3)
					break;
			}

		}

	}

}
