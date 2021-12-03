# -*- coding: utf-8 -*-
"""
Created on Mon Nov 29 22:26:57 2021

@author: Miguel
"""
suma = lambda x,y: x+y
resta = lambda x,y: x-y
multiplicacion = lambda x,y: x*y
division = lambda x,y: x/y

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