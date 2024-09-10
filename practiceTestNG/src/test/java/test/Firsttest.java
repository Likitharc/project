package test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firsttest {

    @Test	 
	public void testgermanyiscalling() throws InterruptedException {
    	WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(1000);
		driver.get("https://app.germanyiscalling.com/common/login/?next=https%3A%2F%2Fapp.germanyiscalling.com%2Fcv%2Fhome%2F");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("llikitha364@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Likitha123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(1000);
		driver.close();
		}

}
