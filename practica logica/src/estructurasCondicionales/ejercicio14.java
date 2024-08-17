package estructurasCondicionales;
import javax.swing.JOptionPane;

public class ejercicio14 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Ingrese 3 numeros");
        String numero1 = JOptionPane.showInputDialog("(1)");
        String numero2 = JOptionPane.showInputDialog("(2)");
        String numero3 = JOptionPane.showInputDialog("(3)");
        int n1 = Integer.parseInt(numero1);
        int n2 = Integer.parseInt(numero2);
        int n3 = Integer.parseInt(numero3);
        if(n1>n2&&n1>n3){
            JOptionPane.showMessageDialog(null, "El mayor es: " + n1);
        }else if(n2>n1&&n2>n3){
            JOptionPane.showMessageDialog(null, "El mayor es: " + n2);
        } else {
            JOptionPane.showMessageDialog(null, "El mayor es: " +n3);
        }
    }
}
