package estructurasCondicionales;
import javax.swing.JOptionPane;

public class ejercicio11 {
    public static void main(String[] args) {
        String c1 = JOptionPane.showInputDialog("Ingrese sus calificaciones (1)");
        String c2 = JOptionPane.showInputDialog("Ingrese sus calificaciones (2)");
        String c3 = JOptionPane.showInputDialog("Ingrese sus calificaciones (3)");
        double calificacion1 = Double.parseDouble(c1);
        double calificacion2 = Double.parseDouble(c2);
        double calificacion3 = Double.parseDouble(c3);
        double pcalificaciones = (calificacion1 + calificacion2 + calificacion3) / 3;
        if(pcalificaciones>=7){
            JOptionPane.showMessageDialog(null, "Alumno aprobado: " + pcalificaciones);
        } else {
            JOptionPane.showMessageDialog(null, "Alumno desaprobado: " + pcalificaciones);
        }
    }
}
