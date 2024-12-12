package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.xpath("//input[@id = 'ctl00_mainContent_ddl_originStation1_CTXT']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@value='HYD']")).click();

		Thread.sleep(1000);

		// (//td[@class='mapbg']) [2] //a[@value='GOI']

		// div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']

		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']"))
				.click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	}

}
