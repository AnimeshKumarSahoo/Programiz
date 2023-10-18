# -*- coding: utf-8 -*-
"""
Created on Mon Aug 19 22:53:49 2019

@author: binay
"""

#To find the factorial
a=int(input("Enter a no. :"))
factorial=1
if a<0:
    print("No factorial is available for negative nos.")
elif a==0:
    print("The factorial is 1")
else:
    for i in range(1,a+1):
        factorial=factorial*i
    print("The factorial is :", factorial)
