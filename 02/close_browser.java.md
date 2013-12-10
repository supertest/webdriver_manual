关闭浏览器
==========

场景
----

关闭浏览器有两种方式：

* close方法

* quit方法

close方法关闭当前的浏览器窗口，quit方法不仅关闭窗口，还会销毁webdriver 实例，释放与driver server之间的连接。

代码
----
```
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;


	public class CloseBrowser {

		public static void main(String[] args) {
			WebDriver dr = new FirefoxDriver();
			dr.quit();	
			System.out.println("浏览器关闭");
		}

	}

```
