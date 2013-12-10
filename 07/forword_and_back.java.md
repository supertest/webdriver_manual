前进和后退
===========

场景
----
这2个功能在测试会中一些场景会被使用到，就像我们模拟一个页面回退，在导向一个页面，在回退时就需要这2个函数。

代码
----

```
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

```
