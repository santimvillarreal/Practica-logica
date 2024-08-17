package estructurasRepetitivas;

public class ejercicio18 {
    public static void main(String[] args) {
        int sumaPares = 0;
        int sumaImpares = 0;
        int i=0;
        for(i=0; i<50;i++){
            if(i % 2 == 0){
                sumaPares = sumaPares + i;
            } else {
                sumaImpares = sumaImpares + i;
            }
        }
        System.out.println("Resultado suma de pares: " + sumaPares);
        System.out.println("Resultado suma impares: " + sumaImpares);
    }
}
