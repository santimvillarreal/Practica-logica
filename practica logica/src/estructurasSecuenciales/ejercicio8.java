package estructurasSecuenciales;
import javax.swing.JOptionPane;

public class ejercicio8 {
    public static void main(String[] args) {
        String Compra = JOptionPane.showInputDialog("Ingrese el valor total de la compra");
        double valorCompra = Double.parseDouble(Compra);
        double descuento = (15 * valorCompra) / 100;
        double valorCD = valorCompra - descuento;
        JOptionPane.showMessageDialog(null, "El nuevo valor de su compra es: " + valorCD);
    }
}
