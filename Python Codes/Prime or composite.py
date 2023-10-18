# -*- coding: utf-8 -*-
"""
Created on Wed Aug 21 19:04:59 2019

@author: binay
"""

#Prime or composite
n=int(input("Enter a no. :"))
a=0
for i in range(1,n+1):
    if(n%i==0):
        a=a+1
if(a==2):
    print("The no. is Prime")
else:
    print("The no. is Composite")
    