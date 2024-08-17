package estructurasSecuenciales;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el radio de un círculo >");
        double radio = Double.parseDouble(entrada.nextLine());
        double area = Math.PI*(Math.pow(radio, 2));
        double circunferencia = 2 * Math.PI * radio;
        System.out.println("El area del círculo es: " + area);
        System.out.println("La circunferencia del círculo es: " + circunferencia);
    }
}
