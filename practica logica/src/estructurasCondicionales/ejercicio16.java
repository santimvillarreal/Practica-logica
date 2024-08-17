package estructurasCondicionales;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        while(opcion!=3){
            System.out.println("***MENU***");
            System.out.println("1- Elevar un número a una potencia X");
            System.out.println("2- Sacar la raiz cuadrada de un número");
            System.out.println("3- Salir");
            System.out.print("Elija una opción >");
            opcion = Integer.parseInt(entrada.nextLine());
            System.out.println(" ");
            if(opcion == 1){
                System.out.println("Elevar un número a una potencia X");
                System.out.print("Ingrese un número >");
                int numero = Integer.parseInt(entrada.nextLine());
                System.out.print("Ingrese el exponente >");
                int exponente = Integer.parseInt(entrada.nextLine());
                double potencia = Math.pow(numero, exponente);
                System.out.println("El resultado es: " + potencia);
                System.out.println(" ");
            } else if(opcion == 2){
                System.out.println("Sacar la raiz cuadrada de un número");
                System.out.print("Ingrese un número >");
                int numero = Integer.parseInt(entrada.nextLine());
                double raiz = Math.sqrt(numero);
                System.out.println("El resultado es: " + raiz);
                System.out.println(" ");
            } else if(opcion == 3){
                System.out.println("Gracias por su visita");
            } else {
                System.out.println("Ingrese un número válido");
                System.out.println(" ");
            }
        } 
    }
    
}
