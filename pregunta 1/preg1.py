# -*- coding: utf-8 -*-
"""
Created on Mon Nov 29 21:31:34 2021

@author: Miguel
"""

def suma  (a,b):
    return a+b

def resta (a,b):
    return a-b
def multiplicacion (a,b):
    return a*b
def division (a,b):
    return a/b

op = 0
while (op != -1):
    print ("1.- Sumar\n2.- Restar\n3.- Multiplicar\n4.- Dividir>")
    op = int(input())
    print ("Numero 1:")
    x = int(input())
    print ("Numero 1:")
    y = int(input())
    if (op == 1 ):
        print ("resultado: ", suma(x, y))
    else: 
        if (op == 2):
            print ("resultado: ",resta(x, y))
        else: 
            if (op == 3):
                print ("resultado: ",multiplicacion(x, y))
            else: 
                if (op == 4):
                    print ("resultado: ",division(x, y))
                else : print("NA") 
            
           
