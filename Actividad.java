import java.util.Scanner;

public class Actividad {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un número entero: ");

        numero = entrada.nextInt();

        if (numero > 0) {

            System.out.println("El número es positivo.");

            if (numero % 2 == 0) {

                System.out.println("El número es par.");

            } else {

                System.out.println("El número es impar.");

            }

        } else if (numero < 0) {

            System.out.println("El número es negativo.");

            if (numero % 2 == 0) {

                System.out.println("El número es par.");

            } else {

                System.out.println("El número es impar.");

            }

        } else {

            System.out.println("El número es cero.");

        }

        entrada.close();

    }

}