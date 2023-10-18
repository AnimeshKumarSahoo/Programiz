# -*- coding: utf-8 -*-
"""
Created on Fri Aug 16 19:08:34 2019

@author: binay
"""

#Determination about the character 
a=input("Enter a character :")
if a>='a' and a<='z':
    print("It is a lower case character")
elif a>='A' and a<='Z':
    print("It is an upper case character")
elif a>='0' and a<='9':
    print("It is a number")
else:
    print("It is a special character")