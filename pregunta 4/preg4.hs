getnum::IO Int
getnum = do
  s <- getLine
  return (read s)

calculadora :: (a -> b -> c) -> ((a, b) -> c)
calculadora f = \(x,y) -> f x y

suma = \a b -> a + b
resta = \a b -> a + b
multiplicacion = \a b -> a * b
division = \a b -> a `div` b

main = do
	putStr("1.- Sumar\n2.- Restar\n3.- Multiplicar\n4.- Dividir\n>\n")
	opc <- getnum

	putStr("Numero 1:\n")
	x <- getnum
	putStr("Numero 2:\n")
	y <- getnum

	let resultado=if opc==1 then calculadora(suma)(x,y) else if opc == 2 then calculadora(resta)(x,y) else if opc == 3 then calculadora(multiplicacion)(x,y) else calculadora(division)(x,y)

	putStrLn("Resultado:"++show(resultado)++"\n")
	main
	 