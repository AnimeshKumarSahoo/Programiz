# -*- coding: utf-8 -*-
"""
Created on Sat Aug 31 18:56:48 2019

@author: binay
"""

#Greatest of 3 numbers
a=int(input("Enter 1st no. :"))
b=int(input("Enter 2nd no. :"))
c=int(input("Enter 3rd no. :"))
print()
if c<a>b:
    print(a,"is the greatest no.")
elif a<b>c:
    print(b,"is the greatest no.")
elif a<c>b:
    print(c,"is the greatest no.")
else:
    print("All are equal")