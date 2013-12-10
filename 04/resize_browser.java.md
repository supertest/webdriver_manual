设置浏览器大小
==============

场景
----
设置浏览器窗口的大小有下面两个比较常见的用途：

* 在统一的浏览器大小下运行用例，比较容易做图形比较。

* 在不同的浏览器大小下访问测试站点，验证聚焦情况；

代码
----


```
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

```

备注
----

webdriver提供了很多调整浏览器窗口的接口，比如move_to(移动窗口)，position(设置或获取浏览器的位置)。

