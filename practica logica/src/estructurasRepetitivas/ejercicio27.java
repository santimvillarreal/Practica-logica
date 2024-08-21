package estructurasRepetitivas;

import javax.swing.JOptionPane;

public class ejercicio27 {
    /*
     * Crea un arreglo unidimensional con un tamaño de 5 (números reales), pregúntale al usuario los valores y calcula la suma y promedio de todos ellos. 
     */
    public static void main(String[] args) {
        double [] arreglo = new double[5];
        double sumatoria = 0;
        JOptionPane.showMessageDialog(null, "Ingrese 5 numeros reales", "Completar arreglo", 1);
        for(int i=0; i<5;i++){
            arreglo[i] = Double.parseDouble(JOptionPane.showInputDialog("Numero " + (i+1)));
            sumatoria = sumatoria + arreglo[i];
        }
        double promedio = sumatoria / 5;
        JOptionPane.showMessageDialog(null, "La sumatoria es " + sumatoria, "Resultado de la sumatoria", 2);
        JOptionPane.showMessageDialog(null, "El promedio es " + promedio, "Resultado del promedio", 2);
    }
}
