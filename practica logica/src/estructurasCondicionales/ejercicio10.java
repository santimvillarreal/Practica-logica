package estructurasCondicionales;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número >");
        int numero = Integer.parseInt(entrada.nextLine());
        if(numero % 2 ==0){
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
    
}
