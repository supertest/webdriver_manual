访问链接
========

情景
----
web UI测试打开一个连接。

webdriver的api里有2种访问url的方式，分别是get和navigate.to方法，get和navigate.to 在早期的版本里有区别，主要在于navigate.to 则会带着上一个页面的内容去下一个页面。

代码
----

```
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;


	public class Get {

		public static void main(String[] args) throws InterruptedException {
			WebDriver dr = new FirefoxDriver();
			Thread.sleep(2000);
			
			String url = "http://www.baidu.com";
			dr.get(url);
			Thread.sleep(2000);
			
			System.out.println("browser will be close");
			dr.quit();	
		}

	}

```

讨论
----
navigate方法实际上会产生1个Navigator对象，其封装了与导航相关的一些方法，比如前进后退等。


