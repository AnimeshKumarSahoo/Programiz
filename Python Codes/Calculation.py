# -*- coding: utf-8 -*-
"""
Created on Mon Aug 19 22:02:24 2019

@author: binay
"""

#Calculation
a=int(input("Enter 1st no. :"))
b=int(input("Enter 2nd no. :"))
c=input("Enter an operator; +,-,*,/,%,// :")
if c=='+':
    d=a+b
elif c=='-':
    d=a-b
elif c=='*':
    d=a*b
elif c=='/':
    d=a/b
elif c=='%':
    d=a%b
elif c=='//':
    d=a//b
else:
    print("No corect operator")
print("The result is", d)