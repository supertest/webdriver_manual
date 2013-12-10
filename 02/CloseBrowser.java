import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CloseBrowser {

	public static void main(String[] args) {
		WebDriver dr = new FirefoxDriver();
		dr.quit();	
		System.out.println("浏览器关闭");
	}

}
