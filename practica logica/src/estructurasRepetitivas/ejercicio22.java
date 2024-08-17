package estructurasRepetitivas;

import javax.swing.JOptionPane;

public class ejercicio22 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Cuantos números desea ingresar?"));
        int [] numeros = new int[numero];
        int sumaPares = 0;
        int conteoPares = 0;
        double sumaImpares = 0;
        double conteoImpares = 0;
        int i;
        JOptionPane.showMessageDialog(null, "Ingrese " + numero + " numeros");
        for(i=0;i<numero;i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("("+ (i+1)+")"));
            if(numeros[i] % 2 == 0){
                sumaPares = sumaPares+ numeros[i];
                conteoPares ++;
            } else {
                sumaImpares = sumaImpares + numeros[i];
                conteoImpares ++;
            }
        }
        double promedioImpar = sumaImpares / conteoImpares;
        JOptionPane.showMessageDialog(null, "La cantidad de numeros pares es " + conteoPares);
        JOptionPane.showMessageDialog(null, "La suma de los numeros pares es " + sumaPares);
        JOptionPane.showMessageDialog(null, "El promedio de los numeros impares es " + promedioImpar);
    }
}
