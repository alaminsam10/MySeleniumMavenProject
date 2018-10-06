package my.maven.pack.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpsLogin {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ups.com/us/en/Home.page");
		driver.manage().window().maximize();
		
		WebElement logIn = driver.findElement(By.xpath("//*[@id=\"ups-navItems\"]/ul[2]/li[1]/a"));
		logIn.click();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("banglamix10@gmail.com");
		WebElement passWord = driver.findElement(By.id("pwd"));
		passWord.sendKeys("Sam1011sam");
		WebElement click = driver.findElement(By.id("submitBtn"));
		click.click();
		driver.findElement(By.linkText("Log Out")).click();
		
  
		
	}

}

