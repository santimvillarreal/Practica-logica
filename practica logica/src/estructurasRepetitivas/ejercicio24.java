package estructurasRepetitivas;

import javax.swing.JOptionPane;

public class ejercicio24 {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para hacer la sumatoria"));
        int []divisor = new int[N];
        double S = 1;
        int i;
        for(i=0;i<divisor.length;i++){
            divisor[i] = i+1;
            if(i % 2 == 0){
                S = S + (1/divisor[i]);
            } else {
                S = S - (1/divisor[i]);
            }
        }
        JOptionPane.showMessageDialog(null,"La sumatoria es: " + S);
    }
}
