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
```python
from selenium import webdriver
import time

dr = webdriver.Chrome()
time.sleep(2)
print 'browser will be closed'
dr.quit() # or dr.close() #close 方法实例不销毁，quit方法实例会被销毁
print 'browser is closed'
```
