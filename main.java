import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("De que altura quieres la piramide");
        int altura = sc.nextInt();
	System.out.println("Aqui tienes la pirámide de " + altura + " de altura.");
   
        for (int i = 1; i <= altura; i++) {
            for (int j = i; j <altura ; j++){
                System.out.print(" "); 
            }
            for (int k = 1; k < i*2 ; k++){
                System.out.print("*"); 
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
