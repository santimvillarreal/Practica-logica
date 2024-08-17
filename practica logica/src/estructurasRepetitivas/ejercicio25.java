package estructurasRepetitivas;

import java.util.Scanner;

public class ejercicio25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese cuantos numeros desea ingresar >");
        int n = Integer.parseInt(entrada.nextLine());
        int [] numeros = new int[n];
        int i=0;
        int numeroMax = 0;
        int numeroMin = 0;
        while(i<n){
            System.out.print("Ingrese un número ("+(i+1)+")>");
            numeros[i] = Integer.parseInt(entrada.nextLine());
            if(i>0){
                if(numeros[i]>numeros[i-1]){
                    if(numeroMax<numeros[i]){
                        numeroMax = numeros[i];
                    }
                } else if(numeros[i]<numeros[i-1]){
                    if(numeroMin>numeros[i]){
                        numeroMin = numeros[i];
                    }
                }
            }
            i++;
        }
        System.out.println("El número máximo es " + numeroMax);
        System.out.println("El número mínimo es " + numeroMin);

    }
    
}
