package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Test4 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		Thread.sleep(2000);

		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());

		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();

		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

		System.out.println(driver.findElements(By.cssSelector("input[type = 'checkbox']")).size());

		WebElement currDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(currDropdown);

		Thread.sleep(2000);

		dropdown.selectByIndex(3);

		driver.findElement(By.id("divpaxinfo")).click();

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "1 Adult");

		Thread.sleep(2000);

		/*
		 * int i = 1;
		 * 
		 * while(i<5) {
		 * 
		 * driver.findElement(By.id("hrefIncAdt")).click(); i++; }
		 */

		for (int i = 1; i <= 4; i++) {

			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		driver.findElement(By.cssSelector("#autosuggest")).sendKeys("ind");

		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options) {

			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}

		}

		driver.findElement(By.xpath("//input[@id = 'ctl00_mainContent_ddl_originStation1_CTXT']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@value='HYD']")).click();

		Thread.sleep(1000);

		// (//td[@class='mapbg']) [2] //a[@value='GOI']

		// div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']

		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']"))
				.click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector("[class='ui-state-default ui-state-highlight ui-state-hover']")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
