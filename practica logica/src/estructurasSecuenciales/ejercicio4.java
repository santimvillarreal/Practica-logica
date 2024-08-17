package estructurasSecuenciales;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cantidad de horas transcuridas");
        System.out.print("Número de horas >");
        int horas = Integer.parseInt(entrada.nextLine());
        int HSeg = horas * 3600;
        System.out.print("Número de minutos >");
        int minutos = Integer.parseInt(entrada.nextLine());
        int MSeg = minutos * 60;
        System.out.print("Numero de segundos >");
        int seg = Integer.parseInt(entrada.nextLine());
        int resultado = HSeg + MSeg + seg;
        System.out.println("El resultado en segundos es: " + resultado);
    }

}
