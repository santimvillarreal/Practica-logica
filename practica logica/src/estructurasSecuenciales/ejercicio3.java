package estructurasSecuenciales;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Intercambiar valores");
        System.out.print("Inserte un número para a >");
        int a = Integer.parseInt(entrada.nextLine());
        System.out.print("Ingrese otor número b >");
        int b = Integer.parseInt(entrada.nextLine());
        int c;
        c = b;
        b = a;
        a = c;
        System.out.println("Nuevo valor de a = " + a);
        System.out.println("Nuevo valor de b = " + b);
    }
}
