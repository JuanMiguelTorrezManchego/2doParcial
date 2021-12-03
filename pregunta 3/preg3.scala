import scala.io.StdIn.readLine
object HolaMundo {
 	
 	def main(args: Array[String]) = {
 		var cad = "Hello all word"
 		var vc = Array(' ');
 		var vs = Array(" ");
 		var p =0
 		for (i <-(0 until cad.length())){
 			if (cad.charAt(i)!=' '){
 				vc :+= cad.charAt(i)
 			} else {
 				vs:+= cad.substring(p,i)
 				p=i+1
 			}
 		}
 		vs:+= cad.substring(p,cad.length())
 		for (x<- vc ){
 			println (x)	
 		}
 		for (x<- vs ){
 			println (x)	
 		}

 		
 	}
}