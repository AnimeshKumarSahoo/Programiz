# -*- coding: utf-8 -*-
"""
Created on Mon Aug 26 21:47:07 2019

@author: binay
"""

#A AB ABC ...
n=int(input("Enter the no of alphabets you would like to see: "))
for i in range (65,65+(n+1)):
    for j in range (65,i):
        a=chr(j)
        print(a, end=" ")
    print()