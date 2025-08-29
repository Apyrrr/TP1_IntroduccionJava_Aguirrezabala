import java.util.Scanner;

public class DivisionEntera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int b = sc.nextInt();

        int resultado = a / b; // división entera, trunca decimales
        System.out.println("Resultado (int): " + resultado);
    }
}

