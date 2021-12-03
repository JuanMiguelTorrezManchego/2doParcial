import scala.io.StdIn.readLine
object HolaMundo {
	
 	val suma:(Int,Int)=>Int = (x,y)=>x+y
 	val resta:(Int,Int)=>Int = (x,y)=>x-y
 	val multiplicacion:(Int,Int)=>Int = (x,y)=>x*y
 	val division:(Int,Int)=>Int = (x,y)=>x/y
 	
 	def main(args: Array[String]) = {
 		var op= 0 
 		while (op != -1){
 			println("1.- Suma\n2.- Resta\n3.- Multiplicacion\n4.- Division\n>\n")
 			op = readLine().toInt
 			println("Numero 1:>\n")
 			var x = readLine().toInt
 			println("Numero 2:>\n")
 			var y = readLine().toInt
 			if (op == 1){
 				println ("Resultado: "+ suma(x,y) );		
 			}else if (op ==2 ){
 				
 				println ("Resultado: "+ resta(x,y));		
 			}else if (op ==3 ){
 				
 				println ("Resultado: "+ multiplicacion(x,y));		
 			}else if (op ==4 ){
 				
 				println ("Resultado: "+ division(x,y));		
 			}else{
 				println ("Resultado: NA");		
 			}
 		}
 	}
}