import Data.List

aver:: String -> [Char]
aver xs = [s |s  <- xs, s/=' ']

main = do
	
	let val1  = "hello all world"
	let val2 = words val1
	let val3 = aver val1
	let val4 = intersperse ' ' val3
	let val5 = words val4
	print (val2)
	print (val5)
	

