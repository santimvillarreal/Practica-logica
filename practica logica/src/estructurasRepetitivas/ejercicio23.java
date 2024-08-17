package estructurasRepetitivas;

import java.util.Scanner;

public class ejercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la tarifa de pago por hora >");
        int tarifa = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese las horas trabajadas");
        int i;
        int [] horas = new int[5];
        int [] salarios = new int[5];
        for(i=0;i<5;i++){
            System.out.print("Persona " + (i+1)+">");
            horas[i] = Integer.parseInt(entrada.nextLine());
        }
        for(i=0;i<5;i++){
            salarios[i] = horas[i] * tarifa;
            System.out.println("Salario de la persona " + (i+1)+ ": " + salarios[i]);
        }
        int sumaSalarios = 0;
        for(i=0;i<5;i++){
            sumaSalarios += salarios[i];
        }
        System.out.println("La suma total de los salarios es " + sumaSalarios);
    }
}
