
public class EjemploTryCatch {
		public static void main(String[] args) {

	        String nombre = "Alura"; 
	        System.out.println("ANTES");

	        try { 
	            System.out.println(nombre);
	        } catch(ArrayIndexOutOfBoundsException ex) { 
	            System.out.println("CATCH");
	        }

	        System.out.println("DESPUES"); 
		}
//No se producirá ningún error y, por lo tanto, no se llamará a la condición de CATCH.
}
