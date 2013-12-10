浏览器最大化
============

场景
----
浏览器最大化一般我们在对页面截图对比，或者需要根据坐标来定位元素的时候，最大化可以保证分辨率的稳定性。

代码
----
```
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

```


