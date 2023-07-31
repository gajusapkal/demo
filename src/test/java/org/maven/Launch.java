package org.maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {

	public static void main(String[] args) {
		System.out.println("Updated in gitHub by gaju");
		WebDriverManager.chromedriver().setup();
         //WebDriverManager.edgedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Allu Arjun Movie");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		WebElement nameText = driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Sarrainodu (4K ULTRA HD) Full Hindi Dubbed Movie |')]"));
		System.out.println(nameText.isDisplayed());
		System.out.println(nameText.getText());
		nameText.click();
		
		
	}

}
