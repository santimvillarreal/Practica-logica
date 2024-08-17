package estructurasSecuenciales;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de hombres >");
        int cHombres = Integer.parseInt(entrada.nextLine());
        System.out.print("Ingrese cantidad de mujeres >");
        int cMujeres = Integer.parseInt(entrada.nextLine());
        int totalA = cHombres + cMujeres;
        int pHombres = (cHombres * 100) / totalA;
        int pMujeres = (cMujeres * 100) / totalA;
        System.out.println("El total de alumnos es: " + totalA);
        System.out.println("El porcentaje de hombres es: " + pHombres + "%");
        System.out.println("El porcentaje de mujeres es: " + pMujeres + "%");
    }
}
