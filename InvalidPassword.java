package SauceDemoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidPassword {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
Thread.sleep(2000);
driver.manage().window().maximize();
driver.get("https://www.saucedemo.com/?utm_source=chatgpt.com");
Thread.sleep(2000);
driver.findElement(By.id("user-name")).sendKeys("standard_user");
Thread.sleep(2000);
driver.findElement(By.id("password")).sendKeys("secrett_saucee");
Thread.sleep(2000);
driver.findElement(By.id("login-button")).click();
Thread.sleep(3000);
driver.close();
	}
}
