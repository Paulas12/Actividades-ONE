
public class Flujo {

	public static void main(String[] args) {

		metodo1();
		System.out.println("Fin de metodo principal");
	}

	public static void metodo1() {
		System.out.println("Inicio de metodo1");
		metodo2();
		System.out.println("Fin de metodo1");
	}

	public static void metodo2(){
		    System.out.println("Inicio de metodo2");
		    for(int i = 1; i <= 5; i++){
		      System.out.println(i);
		    
		   
		    try {
		    	//Error ArithmeticException
				  //int numero = 0; 
				 //double resultado = i/numero; 
				  //System.out.println(resultado);
		    	
		    	//error NullPointerException
				  String test = null; 
				  System.out.println(test.toString());
				  
			  /*}catch(ArithmeticException exception) { 			//si atrapa este error entonces:  
				  System.out.println(exception.getMessage());		//imprimir el mensage que dió esa excepcion
				  exception.printStackTrace(); 						//y tambien quiero saber por donde pasó esa excepcion
				  System.out.println("Atrapó Aritmhetic");
			  }catch (NullPointerException exception) { 			//atrapa el error
				  System.out.println(exception.getMessage());
				  exception.printStackTrace();
				  System.out.println("Atrapó NullPointer");
			  }*/
		    }catch(ArithmeticException | NullPointerException exception) {
		    	System.out.println(exception.getMessage());
		    	exception.printStackTrace();
		    	System.out.println("Atrapó ambas excepciones");
		    	}
		    }
		    
		    System.out.println("Fin de metodo2");
		  }
}
