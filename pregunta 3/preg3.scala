import scala.io.StdIn.readLine
object HolaMundo {
 	def descomponer (a:String)={
 		var vc = Array(' ');
 		for (i <- (0 until a.length())){
 			if (a.charAt(i) != ' '){
 				vc :+= a.charAt(i);
 			}
 		}
 		for (x<- vc ){
 			println (x)	
 		}
 	}
 	def descomponerCad (a:String)={
 		var vs = Array(" ");
 		var p = 0;
 		for (i <- (0 until a.length())){
 			if (a.charAt(i) == ' '){
 				vs:+= a.substring(p,i)
 				p=i+1
 			}
 		}
 		vs:+= a.substring(p,a.length())
 		for (x<- vs ){
 			println (x)	
 		}
 	}
 	def main(args: Array[String]) = {
 		var cad = "Hello all word"
 		var vc = Array(' ');
 		var vs = Array(" ");
 		var p =0
 		descomponer(cad);
 		descomponerCad(cad);
 		
 	}
}