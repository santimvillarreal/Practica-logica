package estructurasRepetitivas;

import javax.swing.JOptionPane;

public class ejercicio21 {
    public static void main(String[] args) {
        String numeroString = JOptionPane.showInputDialog("Ingrese un número para sacar su factorial");
        int numero = Integer.parseInt(numeroString);
        int factorial = 1;
        int i;
        for(i=0;i<(numero+1);i++){
            if(i>0){
                factorial = factorial * i;
            } 
        }
        JOptionPane.showMessageDialog(null,"El factorial es " + factorial);
    }
}
