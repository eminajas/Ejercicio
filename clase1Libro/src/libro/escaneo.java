package libro;
import java.util.Scanner;

public class escaneo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int suma;
        System.out.println("ingrese su primer numero");
        numero1 = entrada.nextInt();
        System.out.println("ingrese su segundo numero");
        numero2 = entrada.nextInt();


        suma = numero1 + numero2;
        System.out.println("el resultado de la suma es suma = " + suma);
    }

}
