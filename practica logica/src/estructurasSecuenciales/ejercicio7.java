package estructurasSecuenciales;
import javax.swing.JOptionPane;

public class ejercicio7 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Los examenes tardan el siguiente tiempo en corregirse\nA=5 minutos, B= 8 minutos, C= 6 minutos");
        String cA = JOptionPane.showInputDialog("Ingrese cantidad de examenes A");
        int A = Integer.parseInt(cA);
        System.out.println(A);
        String cB = JOptionPane.showInputDialog("Ingrese cantidad de examnes B");
        int B = Integer.parseInt(cB);
        System.out.println(B);
        String cC = JOptionPane.showInputDialog("Ingrese cantidad de examenes C");
        int C = Integer.parseInt(cC);
        System.out.println(C);
        int minutosA = A * 5;
        int minutosB = B * 8;
        int minutosC = C * 6;
        int totalMinutos = minutosA + minutosB + minutosC;
        double horas = totalMinutos / 60;
        int choras = (int) horas;
        double minutosR = totalMinutos % 60;
        int cMinutosR = (int) minutosR;
        JOptionPane.showMessageDialog(null, "Se tardará " + choras + " horas y " + cMinutosR + " minutos.");
    } 
}
