package com.oct5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Rajkumar10");
		driver.findElement(By.id("password")).sendKeys("suryaraj", Keys.ENTER);
		driver.findElement(By.xpath("//option[text()='Los Angeles']")).click();
		driver.findElement(By.xpath("//option[text()='Hotel Creek']")).click();
		driver.findElement(By.xpath("//option[text()='Deluxe']")).click();
		driver.findElement(By.xpath("//option[text()='2 - Two']")).click();
		driver.findElement(By.xpath("//input[contains(@value, '06/12/2021')]")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("20/12/2021");
		driver.findElement(By.xpath("//input[contains(@value, '07/12/2021')]")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("25/12/2021");
		driver.findElement(By.xpath("(//option[text()='3 - Three'])[2]")).click();
		driver.findElement(By.xpath("//option[text()='0 - None']")).click();
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("Rajkumar");
		driver.findElement(By.id("last_name")).sendKeys("T");
		driver.findElement(By.id("address")).sendKeys("Thoraipakkam, OMR, Chennai-600097");
		driver.findElement(By.id("cc_num")).sendKeys("1252654895637946");
		driver.findElement(By.xpath("//option[text()='Master Card']")).click();
		driver.findElement(By.xpath("//option[text()='January']")).click();
		driver.findElement(By.xpath("//option[text()='2021']")).click();
		driver.findElement(By.id("cc_cvv")).sendKeys("586");
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(5000);
		WebElement getText = driver.findElement(By.name("order_no"));
		String attribute = getText.getAttribute("value");
		System.out.println(attribute);
		driver.close();
		
		
		
		
	}
}
