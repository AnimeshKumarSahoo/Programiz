# -*- coding: utf-8 -*-
"""
Created on Sat Aug 31 19:11:43 2019

@author: binay
"""
#Reverse of a no if no.>1000
i = int(input("Enter a number: "))
a = 0
if i>1000:
    while(i > 0):
        Remainder = i %10
        a = (a *10) + Remainder
        i = i //10
    print("Reverese of entered no. is = ",a)
else:
    print("The entered no is lesser than 1000")