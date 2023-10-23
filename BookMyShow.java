package com.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Workboook\\SeleniumTest\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://in.bookmyshow.com/explore/home/");
		driver.manage().window().maximize();
		

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bengaluru");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class=\"bwc__sc-1iyhybo-10 cWWamV\"]/ul/li[1]")).click();
		
		driver.findElement(By.xpath("//div[@class='bwc__sc-1nbn7v6-14 khhVFa']")).click();
		
		driver.findElement(By.xpath("//div[@class='bwc__sc-dh558f-10 bUPSGq'][2]")).click();
		
		driver.findElement(By.id("emailId")).sendKeys("selauto@yopmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class=\"bwc__sc-dh558f-6 iBRNFr\"]/form/div[2]/button")).click();
		
		WebElement ele = driver.findElement(By.xpath("//div[text()='705495']"));
		ele.getText();
	}

}
