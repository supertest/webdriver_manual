import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;


public class FindElementsUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new FirefoxDriver();
		
		File file = new File("src/checkbox.html");
		String filePath = "file:///" + file.getAbsolutePath();
		
		dr.get(filePath);
		Thread.sleep(1000);
		
		//选择所有的checkbox并全部勾上
		List<WebElement> checkboxes = dr.findElements(By.cssSelector("input[type=checkbox]"));
		for(WebElement checkbox : checkboxes) {
			checkbox.click();
		}
		
		dr.navigate().refresh();
		
		//对某一个元素进行操作，可以这样做
		inputs.get(0).click()//选择第一个checkbox
		
		//打印当前页面上有多少个checkbox,得到list的大小
		System.out.printf("%d\n", checkboxes.size());
		
		//选择页面上所有的input，然后从中过滤出所有的checkbox并勾选之
		List<WebElement> inputs = dr.findElements(By.tagName("input"));
		
		for(WebElement input : inputs){
			if(input.getAttribute("type").equals("checkbox")){
				input.click();
			}
		}
		
		//把页面上最后1个checkbox的勾给去掉
		List<WebElement> allCheckboxes = dr.findElements(By.cssSelector("input[type=checkbox]"));
		allCheckboxes.get(allCheckboxes.size() - 1).click();
		
		Thread.sleep(1000);
		System.out.println("browser will be close");
		dr.quit();	
	}

}
