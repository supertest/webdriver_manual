import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OperateElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new FirefoxDriver();
		
		File file = new File("src/operate_element.html");
		String filePath = "file:///" + file.getAbsolutePath();
		
		
		dr.get(filePath);
		Thread.sleep(1000);
		
//		click
		dr.findElement(By.linkText("Link1")).click();
		Thread.sleep(1000);
		dr.findElement(By.linkText("Link1")).click();
		
//		send_keys
		WebElement element = dr.findElement(By.name("q"));
		element.sendKeys("something");
		Thread.sleep(1000);
		
//		clear
		element.clear();
		
		Thread.sleep(1000);
		System.out.println("browser will be close");
		dr.quit();	
	}

}
