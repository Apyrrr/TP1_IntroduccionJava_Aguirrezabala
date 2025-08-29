import java.util.Scanner;

public class LeerNombreEdad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = input.nextLine();

        System.out.print("Edad: ");
        int edad = input.nextInt();

        System.out.println("Hola " + nombre + ", tenés " + edad + " años.");
    }
}
