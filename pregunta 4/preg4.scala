import scala.io.StdIn.readLine
object HolaMundo {
 	def calculadora (x:Int ,y:Int,operacion:String):Int = {
 	 	operacion match {
 	 	 	case "suma" => suma(x,y)
 	 	 	case "resta" => resta(x,y)
 	 	 	case "multiplicacion" => multiplicacion(x,y)
 	 	 	case "division" => division(x,y)
 	 	}
 	}
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
 				println ("Resultado: "+ calculadora(x,y,"suma") );		
 			}else if (op ==2 ){
 				println ("Resultado: "+ calculadora(x,y,"resta") );
 			}else if (op ==3 ){
 				println ("Resultado: "+ calculadora(x,y,"multiplicacion") );	
 			}else if (op ==4 ){
 				println ("Resultado: "+ calculadora(x,y,"division") );
 			}else{
 				println ("Resultado: NA");		
 			}
 		}
 	}
}