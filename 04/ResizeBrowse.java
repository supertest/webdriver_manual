import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ResizeBrowser {

	public static void main(String[] args) {
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().setSize(new Dimension(240, 320));
		dr.get("http://www.baidu.com/");
		dr.quit();
	}

}
