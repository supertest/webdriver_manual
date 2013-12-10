from selenium import webdriver
import time

dr = webdriver.Chrome()

dr.set_window_size(240, 320)
dr.get('http://www.baidu.com')

time.sleep(5)
dr.quit()
