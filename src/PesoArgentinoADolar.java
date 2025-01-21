import java.io.IOException;
import java.util.Scanner;

public class PesoArgentinoADolar {

    public void pesoArgentinoADolar() throws IOException, InterruptedException {
        // Implementar la lógica para convertir pesos argentinos a dólares

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor que desea convertir:");
        double cantidad = scanner.nextDouble();

        Conversor conversor = new Conversor();

        System.out.println("El valor de " + cantidad + " pesos argentinos " + "corresponde al valor final de: "
                + "$" + conversor.conversor("ARS", "USD", cantidad) + " [USD]");
    }
}