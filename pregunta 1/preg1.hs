getnum::IO Int
getnum = do
  s <- getLine
  return (read s)

suma :: Int -> Int -> Int
suma x y = x+y

resta :: Int -> Int ->Int
resta x y = x-y

multiplicacion :: Int -> Int ->Int
multiplicacion x y = x*y

division :: Int -> Int ->Int
division x y =  x `div` y 

main= do
putStr("1.- Sumar\n2.- Restar\n3.- Multiplicar\n4.- Dividir\n>\n")
opc <- getnum

putStr("Numero 1:\n")
x <- getnum
putStr("Numero 2:\n")
y <- getnum



let calculadora=if opc==1 then suma x y else if opc == 2 then resta x y else if opc == 3 then multiplicacion x y else division x y 

putStrLn("Resultado:"++show(calculadora)++"\n")

main
