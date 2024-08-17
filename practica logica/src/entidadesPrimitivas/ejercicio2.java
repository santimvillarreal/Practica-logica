package entidadesPrimitivas;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte 1 número (a)>");
        int a = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese 1 número (b)>");
        int b = Integer.parseInt(entrada.nextLine());
        boolean resultado;
        resultado = ((3+5*8) < 3) & (((-6/3) * 4) + 2 < 2) || (a>b);
        System.out.println("El resultado es: " + resultado);
    }
}
