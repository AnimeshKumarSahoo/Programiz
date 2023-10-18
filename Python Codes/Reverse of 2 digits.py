# -*- coding: utf-8 -*-
"""
Created on Wed Aug 14 18:26:03 2019

@author: Binay
"""

#Reverse of two digits
a=int(input("Enter a 2 digit no. :"))
b = a//10
c = a%10
d = (c*10)+b
print("The reverse of the no. is :", d)