package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.junit.ArrayAsserts;

public class Test7 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		String[] items = { "Cauliflower", "Tomato", "Beans", };

		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));

		int j = 0;

		for (int i = 0; i < product.size(); i++) {

			String[] name = product.get(i).getText().split("-");

			String updatedName = name[0].trim();

			List itemsneeded = Arrays.asList(items);

			if (itemsneeded.contains(updatedName)) {

				j++;

				driver.findElements(By.xpath("//div[@class = 'product-action']/button")).get(i).click();

				if (j == 3)
					break;
			}

		}

	}

}
