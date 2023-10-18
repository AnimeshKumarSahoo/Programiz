# -*- coding: utf-8 -*-
"""
Created on Mon Aug 26 22:03:56 2019

@author: binay
"""

#A BB CCC ...
n= int(input("Enter the no of alphabets you would like to see: "))
for i in range (64,64+(n+1)):
    for j in range (64,i):
        a=chr(i)
        print(a, end=" ")
    print()