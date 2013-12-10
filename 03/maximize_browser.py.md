浏览器最大化
============

场景
----
浏览器最大化一般我们在对页面截图对比，或者需要根据坐标来定位元素的时候，最大化可以保证分辨率的稳定性。

代码
----
```python
from selenium import webdriver
import time

dr = webdriver.Chrome()
time.sleep(2)
print 'maximize browser'

dr.maximize_window()

time.sleep(2)
print 'close browser'

dr.quit()

```


