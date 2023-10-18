# -*- coding: utf-8 -*-
"""
Created on Mon Aug 12 17:28:46 2019

@author: binay
"""

#Multiplication table up 10 places
a=int(input("Enter a no. :"))
for i in range(1,11):
    b = a * i
    print(a,'x',i,'=',b)