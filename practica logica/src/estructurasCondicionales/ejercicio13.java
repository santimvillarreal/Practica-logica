package estructurasCondicionales;
import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese 2 números");
        System.out.print(">");
        int numero1 = Integer.parseInt(entrada.nextLine());
        System.out.print(">");
        int numero2 = Integer.parseInt(entrada.nextLine());
        if(numero1 == numero2){
            int resultado1 = numero1 * numero2;
            System.out.println("Resultado: " + resultado1);
        }else if(numero1>numero2){
            int resultado2 = numero1 - numero2;
            System.out.println("Resultado: " + resultado2);
        }else{
            int resultado3 = numero1 + numero2;
            System.out.println("Resultado: " + resultado3);
        }
    }
}
