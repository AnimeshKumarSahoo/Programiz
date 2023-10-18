# -*- coding: utf-8 -*-
"""
Created on Wed Aug 14 21:03:59 2019

@author: binay
"""

#Reverse of three digits
a = int(input("Enter a 3 digit no. :"))
b = a//100
c = (a%100)//10
d = (a%100)%10
e = (d*100)+(c*10)+b
print("The reverse of the no. is :", e)