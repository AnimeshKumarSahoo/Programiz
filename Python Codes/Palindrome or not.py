# -*- coding: utf-8 -*-
"""
Created on Wed Aug 21 18:19:42 2019

@author: binay
"""

#Palindrome or not
i = int(input("Enter a number: "))
a = 0
b=i
while(i > 0):
    Remainder = i %10
    a = (a *10) + Remainder
    i = i //10
if a==b:
    print("The no. is a palindrome")
else:
    print("The no. is not a palindrome")