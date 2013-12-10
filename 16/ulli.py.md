处理UL下面的LI
===========

场景
----
在实际测试用我们经常需要验证或者点击UI或者DIV下面的元素，一般以UL下面的LI最为常见，下面介绍使用层级定位来处理。

代码
----
### breadcrumb.html
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
					<ul class="uitest">
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

### breadcrumb.rb
```
	#encoding: utf-8
	require 'selenium-webdriver'

	dr = Selenium::WebDriver.for :chrome
	file_path = 'file:///' + File.expand_path(File.join('.', 'ulli.html'))
	dr.get file_path

	# 获得其父层级
	anstors = dr.find_element(:class, 'ulli').find_elements(:tag_name, 'a').map { |link| link.text }
	p anstors
	sleep(1)

	# 获取当前层级
	# 由于页面上可能有很多class为active的元素
	# 所以使用层级定位最为保险
	puts dr.find_element(:class, 'ulli').find_element(:class, 'active').text

	dr.quit()

```

