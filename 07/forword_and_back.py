from selenium import webdriver
from time import sleep
import os

dr = webdriver.Firefox()

first_url = 'http://www.baidu.com'

dr.get(first_url)
sleep(3)
second_url = 'http://www.youdao.com'

dr.get(second_url)
sleep(3)

print "back to %s" %(first_url)
dr.back()
sleep(3)
print "forward to %s" %(second_url)
dr.forward()
sleep(3)
dr.quit()
