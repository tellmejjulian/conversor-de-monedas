import java.io.IOException;
import java.util.Scanner;

public class PesoMexicanoADolar {

    public void pesoMexicanoADolar() throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor que desea convertir:");
        double cantidad = scanner.nextDouble();

        Conversor conversor = new Conversor();

        System.out.println("El valor de " + cantidad + " [MXN] " + "corresponde al valor final de: "
                + "$" + conversor.conversor("MXN", "USD", cantidad) + " dolares");
    }
}