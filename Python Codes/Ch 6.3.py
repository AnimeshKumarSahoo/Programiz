# -*- coding: utf-8 -*-
"""
Created on Mon Aug 12 17:28:46 2019

@author: binay
"""

a = int(input())
b = int(input())
c = int(input())
if(a>b>c):
    if (a**2 == ((b+c))**2):
        print("Yes")
    else:
        print("No")
elif(b>a>c):
    if (b**2 == ((a+c))**2):
        print("Yes")
    else:
        print("No")
elif(c>a>b):
    if (c**2 == ((b+a))**2):
        print("Yes")
    else:
        print("No")