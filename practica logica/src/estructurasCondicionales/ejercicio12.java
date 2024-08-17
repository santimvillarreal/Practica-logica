package estructurasCondicionales;
import javax.swing.JOptionPane;

public class ejercicio12 {
    public static void main(String[] args) {
        String mc = JOptionPane.showInputDialog("Ingrese el monto de su compra");
        double monto = Double.parseDouble(mc);
        if(monto>100){
            double descuento = (20 * monto) / 100;
            double nuevoMonto = monto - descuento;
            JOptionPane.showMessageDialog(null, "Obtiene descuento, nuevo monto: $" + nuevoMonto);
        } else {
            JOptionPane.showMessageDialog(null, "No recibe descuento, monto: $" + monto);
        }
    }
}
