package estructurasRepetitivas;

import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double [] notas = new double[10];
        int i;
        double suma = 0;
        double notaBaja = 0;
        double notaAlta = 0;
        System.out.println("Ingrese 10 notas");
        for(i=0;i<=9;i++){
            System.out.print("("+(i+1)+")>");
            notas[i] = Double.parseDouble(entrada.nextLine());
            if(i>0){
                if(notas[i]<notas[i-1]){
                    notaBaja = notas[i];
                } else if(notas[i]>notas[i-1]){
                    notaAlta = notas[i];
                }
            }
        }
        for(i=0;i<notas.length;i++){
            suma += notas[i];
        }
        double promedio = suma / 10;
        System.out.println("La nota más baja es " + notaBaja);
        System.out.println("La nota más alta es: " + notaAlta);
        System.out.println("El promedio es igual a " + promedio);
    }
}
