/* 
* Ejercicio pirámide
*
* Dibuja una pirámide con asteriscos con una altura ingresada desde teclado.
*
* @author AntonioLuisGarcia
* @author daluga0503
*/



import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("De que altura quieres la piramide");
        int altura = sc.nextInt();

	System.out.println("Aqui tienes la pirámide de " + altura + " de altura.");
        for (int i = 1; i <= altura; i++) {
            for (int j = i; j <altura ; j++){
                System.out.print(" ");             }
            for (int k = 1; k < i*2 ; k++){
                System.out.print(caracter);
            }
            System.out.println(" ");

        }

	System.out.println("La altura " + (esPrimo(altura)?"es un numero primo":"no es un numero primo");

	System.out.println("La pirámide tiene una altura " + (altura%2==0)?"par" : "impar");
        sc.close();
    }

	public static boolean esPrimo(int n) {
	     for (int i = 2; i <= Math.sqrt(n); i++) {
                  if (n % i == 0) {
                     return false;
        	  }
    	     }

             return true;
	}
}
