package estructurasCondicionales;
import javax.swing.JOptionPane;

public class ejercicio15 {
    public static void main(String[] args) {
        double kiloFruta = 11.5;
        JOptionPane.showMessageDialog(null, "El kilo de fruta vale " + kiloFruta);
        String kiloComprado = JOptionPane.showInputDialog("Cuantos kilos lleva el cliente?");
        double kilosComprados = Double.parseDouble(kiloComprado);
        double precio = kiloFruta * kilosComprados;
        JOptionPane.showMessageDialog(null, "El precio sin descuento es " + precio);
        if(kilosComprados > 2 && kilosComprados < 5){
            double descuento = (precio * 10) / 100;
            double precioR = precio - descuento;
            JOptionPane.showMessageDialog(null, "El precio final con descuento es " + precioR);
        }else if(kilosComprados > 5 && kilosComprados < 10){
            double descuento = (precio * 15) / 100;
            double precioR = precio - descuento;
            JOptionPane.showMessageDialog(null, "El precio final con descuento es " + precioR);
        }else if(kilosComprados > 10){
            double descuento = (precio * 20) / 100;
            double precioR = precio - descuento;
            JOptionPane.showMessageDialog(null, "El precio final con descuento es " + precioR);
        }else{
            double precioR = precio;
            JOptionPane.showMessageDialog(null, "El precio final sin descuento (menor a 2kg) es " + precioR);
        } 
    }
}
