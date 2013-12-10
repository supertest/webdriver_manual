import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Maximize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new FirefoxDriver();
		Thread.sleep(2000);
		
		System.out.println("maximize browser");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		
		dr.quit();	
	}

}
