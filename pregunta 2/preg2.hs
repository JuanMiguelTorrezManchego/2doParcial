
getnum::IO Int
getnum = do
  s <- getLine
  return (read s)


main= do
	
	putStr("1.- Sumar\n2.- Restar\n3.- Multiplicar\n4.- Dividir\n>\n")
	opc <- getnum

	putStr("Numero 1:\n")
	x <- getnum
	putStr("Numero 2:\n")
	y <- getnum

	let calculadora=if opc==1 then (\a b -> a + b) x y else if opc == 2 then (\a b -> a - b) x y else if opc == 3 then (\a b -> a * b) x y else (\a b -> a `div` b) x y 

	putStrLn("Resultado:"++show(calculadora)++"\n")
	main
