from selenium import webdriver
import time

dr = webdriver.Chrome()
time.sleep(2)
print 'browser will be closed'
dr.quit() # or dr.close() #close 方法实例不销毁，quit方法实例会被销毁
print 'browser is closed'
