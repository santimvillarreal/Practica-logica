package estructurasRepetitivas;

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] n = new int[10];
        int i=0;
        int positivos = 0;
        int negativos = 0;
        int neutros = 0;
        System.out.println("Ingrese 10 números");
        for(i=0;i<=9;i++){
            System.out.print("(" + (i+1) + ")>");
            n[i]=Integer.parseInt(entrada.nextLine());
        }
        for(i=0;i<10;i++){
            if(n[i]>0){
                positivos = positivos + 1;
            }else if(n[i]<0){
                negativos = negativos +1;
            }else if(n[i] == 0){
                neutros = neutros + 1;
            }
        }
        System.out.println("Cantidad de n° positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de números neutros: " + neutros);
    }
}
