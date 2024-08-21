package estructurasRepetitivas;

import javax.swing.JOptionPane;

public class ejercicio29 {
    /*
     * Crear un arreglo unidimensional donde el usuario indique el tamaño por teclado, luego llenar el arreglo con números aleatorios entre 1 - 100 y por último mostrar los elementos del arreglo.
     */
    public static void main(String[] args) {
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero (0 a 10)", "Tamaño de arreglo", 1));
        while(tamaño<0 || tamaño>10){
            tamaño = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero (0 a 10)", "Tamaño de arreglo", 1));
        }
        int [] arreglo = new int[tamaño];
        for(int i=0; i<tamaño;i++){
            arreglo[i] = (int)(Math.random()*100 + 1);
            JOptionPane.showMessageDialog(null, arreglo[i], "Resultado arreglo [" + (i+1) + "]", 3);
        }
    }
    
}
