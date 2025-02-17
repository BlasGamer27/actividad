import java.util.Scanner;

public class Actividad {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        
        // Determinar si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        
        // Determinar si el número es par o impar (excluyendo el caso en que sea cero)
        if (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("El número es par.");
            } else {
                System.out.println("El número es impar.");
            }
        }

        // Uso de and y or
        if (numero > 0 && numero % 2 != 0) {
            System.out.println("El número es positivo e impar.");
        } else if (numero < 0 || numero == 0) {
            System.out.println("El número es negativo o cero.");
        }
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
