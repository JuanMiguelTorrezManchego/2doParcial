# -*- coding: utf-8 -*-
"""
Created on Mon Nov 29 22:38:23 2021

@author: Miguel
"""
def calculadora (operacion, x, y):
    return operacion (x,y)

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
        print ("resultado: ", calculadora(suma, x, y))
    else: 
        if (op == 2):
            print ("resultado: ",calculadora(resta, x, y))
        else: 
            if (op == 3):
                print ("resultado: ",calculadora(multiplicacion, x, y))
            else: 
                if (op == 4):
                    print ("resultado: ",calculadora(division, x, y))
                else : print("NA") 