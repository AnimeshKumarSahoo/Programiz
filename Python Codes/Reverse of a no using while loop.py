# -*- coding: utf-8 -*-
"""
Created on Wed Aug 21 18:19:42 2019

@author: binay
"""

#Reverse of any no.
i = int(input("Enter a number: "))
a = 0
b=i
while(i > 0):
    Remainder = i %10
    a = (a *10) + Remainder
    i = i //10
print("Reverese of entered no. is = ",a)
