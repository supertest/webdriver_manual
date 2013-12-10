打印当前页面的title及url
========================

情景
----
测试中，页面的title和当前的url可以用来做断言，非常简单且有效。

代码
----
```
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;


	public class TitleAndUrl {

		public static void main(String[] args) throws InterruptedException {
			WebDriver dr = new FirefoxDriver();
			Thread.sleep(2000);
			
			String url = "http://www.baidu.com";
			
			dr.get(url);
			Thread.sleep(2000);
			
			System.out.println("title of current page is"+dr.getTitle());
			System.out.println("url of current page is "+dr.getCurrentUrl());
			
			System.out.println("browser will be close");
			dr.quit();	
		}

	}	

```
