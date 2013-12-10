打印当前页面的title及url
========================

情景
----
测试中，页面的title和当前的url可以用来做断言，非常简单且有效。

代码
----
```python
# -*- coding: utf-8 -*- 
from selenium import webdriver
from time import sleep
import os

dr = webdriver.Firefox()
url = 'http://www.baidu.com'
dr.get(url)

print "title of current page is %s" %(dr.title)
print "url of current page is %s" %(dr.current_url)

sleep(10)

dr.quit()

```
