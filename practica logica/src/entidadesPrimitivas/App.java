package entidadesPrimitivas;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a;
        int b;
        int c;
        int exponente = 2;
        double resultado1;
        double resultado2;
        System.out.println("Ingrese 3 números");
        System.out.print("Ingrese un número (a)>");
        a = Integer.parseInt(entrada.nextLine());
        System.out.print("Ingrese un número (b)>");
        b = Integer.parseInt(entrada.nextLine());
        System.out.print("Ingrese un número (c)>");
        c = Integer.parseInt(entrada.nextLine());
        double potencia = Math.pow(b, exponente);
        System.out.println(potencia);
        double baseR = potencia - (4*a*c);
        System.out.println(baseR);
        double raiz = Math.sqrt(baseR);
        System.out.println(raiz);
        entrada.close();
        resultado1 = (-b + raiz) / (2*a);
        System.out.println("El resultado 1 es: " + resultado1);
        resultado2 = (-b - raiz) / (2*a);
        System.out.println("El resultado 2 es: " + resultado2);
    }
}
