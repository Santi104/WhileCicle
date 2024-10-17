import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroEntrada = 0;
        int resultado = 0;

        System.out.println("Ingrese el número que desea calcular:");
        numeroEntrada = sc.nextInt();

        Logic logic = new Logic();
        resultado = logic.sumarNaturales(numeroEntrada);

        // Mostrar el resultado
        System.out.println("La suma de los primeros " + numeroEntrada + " números naturales es igual a " + resultado);
    }
}
