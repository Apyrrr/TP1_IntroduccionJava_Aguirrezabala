import java.util.Scanner;

public class OperacionesEnteros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Primer entero: ");
        int a = input.nextInt();
        System.out.print("Segundo entero: ");
        int b = input.nextInt();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División (entera): " + (a / b));
    }
}
