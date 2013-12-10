import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ForwardAndBack {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new FirefoxDriver();
		Thread.sleep(2000);
		
		String firstUrl = "http://www.baidu.com";
		
		dr.get(firstUrl);
		Thread.sleep(1000);
		
		String secondUrl = "http://www.youdao.com";
		
		dr.get(secondUrl);
		Thread.sleep(1000);

		System.out.println("back to"+firstUrl);
		dr.navigate().back();
		Thread.sleep(1000);
    
		System.out.println("forward to"+secondUrl);
		dr.navigate().forward();
		Thread.sleep(1000);
		
		System.out.println("browser will be close");
		dr.quit();	
	}

}
