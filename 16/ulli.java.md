处理UL下面的LI
===========

场景
----
在实际测试用我们经常需要验证或者点击UI或者DIV下面的元素，一般以UL下面的LI最为常见，下面介绍使用层级定位来处理。

代码
----
### UL.html
```
	<html>
		<head>
			<meta http-equiv="content-type" content="text/html;charset=utf-8" />
			<title>breadcrumb</title>		
			<script type="text/javascript" async="" src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
			<link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" />		
			<script type="text/javascript">
				$(document).ready(
					function(){
						
					}
				);
			</script>
		</head>
		<body>
			<h3>breadcrumb</h3>
			<div class="row-fluid">
				<div class="span3">		
					<ul class="ultest">
						<li><a href="#">Home</a> <span class="divider">/</span></li>
						<li><a href="#">Library</a> <span class="divider">/</span></li>
						<li class="active">Data</li>
					</ul>
				</div>		
			</div>		
		</body>
		<script src="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
	</html>

```

### breadcrumb.java
```
	import java.io.File;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;


	public class ULLi {

		public static void main(String[] args) throws InterruptedException {
			WebDriver dr = new FirefoxDriver();
			
			File file = new File("src/ulli.html");
			String filePath = "file:///" + file.getAbsolutePath();
			
			
			dr.get(filePath);
			Thread.sleep(1000);
			
	//		获得其父层级
			List<WebElement> ancestors = dr.findElement(By.className("breadcrumb")).findElements(By.tagName("a"));
			for(WebElement link : ancestors){
				System.out.println(link.getText());
			}
			
	//		获取当前层级
	//		由于页面上可能有很多class为active的元素
	//		所以使用层级定位最为保险
			WebElement current = dr.findElement(By.className("breadcrumb")).findElement(By.className("active"));
			System.out.println(current.getText());
			
			Thread.sleep(1000);
			System.out.println("browser will be close");
			dr.quit();	
		}

	}


```

