package SauceDemoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutFlow {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(2000);
driver.get("https://www.saucedemo.com/?utm_source=chatgpt.com");
Thread.sleep(2000);
driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.id("password")).sendKeys("secret_sauce");
Thread.sleep(2000);
driver.findElement(By.id("login-button")).click();
driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
driver.findElement(By.cssSelector("a[class='shopping_cart_link']")).click();
driver.findElement(By.name("checkout")).click();
driver.findElement(By.cssSelector("input[data-test='firstName']")).sendKeys("abc");
driver.findElement(By.cssSelector("input[data-test='lastName']")).sendKeys("xyz");
driver.findElement(By.cssSelector("input[data-test='postalCode']")).sendKeys("574141");
driver.findElement(By.name("continue")).click();
driver.findElement(By.id("finish")).click();
Thread.sleep(3000);
driver.close();
	}
}