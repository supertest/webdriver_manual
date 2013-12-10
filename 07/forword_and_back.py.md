前进和后退
===========

场景
----
这2个功能在测试会中一些场景会被使用到，就像我们模拟一个页面回退，在导向一个页面，在回退时就需要这2个函数。

代码
----

```python
from selenium import webdriver
from time import sleep
import os


dr = webdriver.Firefox()

first_url = 'http://www.baidu.com'
print "now access %s" %(first_url)

dr.get(first_url)
sleep(3)
second_url = 'http://www.youdao.com'
print "now access %s" %(second_url)
dr.get(second_url)
sleep(3)

print "back to %s" %(first_url)
dr.back()
sleep(3)
print "forward to %s" %(second_url)
dr.forward()
sleep(3)
dr.quit()
```
