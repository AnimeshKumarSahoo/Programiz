# -*- coding: utf-8 -*-
"""
Created on Mon Aug 19 22:30:36 2019

@author: binay
"""
  
# To check whether a no is prime or composite
n=int(input("Enter a no. :"))
if n > 1: 
   for i in range(2, n//2): 
       if (n % i) == 0: 
           print(n, "is a composite no")
       break
else: 
    print(n, "is a prime number") 
