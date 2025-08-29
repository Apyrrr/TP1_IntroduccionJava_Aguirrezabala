import java.util.Scanner;

public class DivisionDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número decimal: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese el segundo número decimal: ");
        double b = sc.nextDouble();

        double resultado = a / b; // conserva decimales
        System.out.println("Resultado (double): " + resultado);
    }
}
