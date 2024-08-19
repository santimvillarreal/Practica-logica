package estructurasRepetitivas;

import java.util.Scanner;

public class ejercicio26 {
    /*
     *  Imprimir la serie de los “N” términos de la serie de Fibonacci. 
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba cuantos numeros de la serie fibonacci desea imprimir >");
        int numero = Integer.parseInt(entrada.nextLine());
        int j = 1;
        int i = 0;
        int k=0;
        int fibo = 0;
        while(k<numero){
            if(k==0){
                System.out.println(i);
                k++;
            }else if(k==1){
                System.out.println(j);
                k++;
            }
            fibo = j + i;
            System.out.println(fibo);
            k++;
            if(k>0 && k % 2 == 0){
                j = fibo;
            } else {
                i= fibo;
            }
        }
        entrada.close();
    }
}
