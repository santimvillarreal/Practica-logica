package estructurasRepetitivas;

import javax.swing.JOptionPane;

public class ejercicio17 {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Ingrese un número para sumarle todos los anteriores");
        int n = Integer.parseInt(numero);
        int resultado = 0;
        for(int i=0 ; i<n ; i++){
            resultado = resultado + (i+1);
        }  
        JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
    }
    
}
