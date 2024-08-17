package estructurasSecuenciales;
import javax.swing.JOptionPane;

public class ejercicio9 {
    public static void main(String[] args) {
        String c1 = JOptionPane.showInputDialog("Ingrese las calificaciones de sus parciales (1)");
        String c2 = JOptionPane.showInputDialog("Ingrese las calificaciones de sus parciales (2)");
        String c3 = JOptionPane.showInputDialog("Ingrese las calificaciones de sus parciales (3)");
        double calificacion1 = Double.parseDouble(c1);
        double calificacion2 = Double.parseDouble(c2);
        double calificacion3 = Double.parseDouble(c3);
        String F = JOptionPane.showInputDialog("ingrese la calificación de su final");
        double calificacionFinal = Double.parseDouble(F);
        String TF = JOptionPane.showInputDialog("Ingrese la calificacion de su trabajo final");
        double trabajoF = Double.parseDouble(TF);
        double promedioP = (calificacion1 + calificacion2 + calificacion3) / 3;
        double notaParciales = 0.55*promedioP;
        double notaFinal = 0.3*calificacionFinal;
        double notaTF = 0.15*trabajoF;
        double resultadoNota = notaParciales + notaFinal + notaTF;
        JOptionPane.showMessageDialog(null, "Su calificación es " + resultadoNota);
    }
}
