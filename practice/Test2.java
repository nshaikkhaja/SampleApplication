package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement currDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Thread.sleep(1000);
		
		Select dropdown = new Select(currDropdown);
		
		dropdown.selectByIndex(3);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		
		Thread.sleep(1000);
		
		/*driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		
		Thread.sleep(1000); */
		
		//parent child relationship/traverse xpath
		
		//driver.findElement(By.xpath("//div[@id = 'ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value = 'HYD']")).click();
		
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@id = 'ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
		
		Thread.sleep(1000);
		
		
		
		
		
		
		
	}

}
