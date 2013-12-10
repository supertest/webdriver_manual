访问链接
========

情景
----
web UI测试打开一个连接。

在python的webdrive中，访问url时应该使用get方法。

代码
----

```python
from selenium import webdriver
import time

dr = webdriver.Firefox()

url = 'http://www.baidu.com'
dr.get(url)
time.sleep(3)

dr.quit()
```



