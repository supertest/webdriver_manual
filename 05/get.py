from selenium import webdriver
import time

dr = webdriver.Firefox()

url = 'http://www.baidu.com'
dr.get(url)
time.sleep(3)

dr.quit()
