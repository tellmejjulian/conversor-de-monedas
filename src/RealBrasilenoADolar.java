import java.io.IOException;
import java.util.Scanner;

public class RealBrasilenoADolar {

    public void realBrasilenoADolar() throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor que desea convertir:");
        double cantidad = scanner.nextDouble();

        Conversor conversor = new Conversor();

        System.out.println("El valor de " + cantidad + " Real Brasileño, " + "corresponde al valor final de: "
                + "$" + conversor.conversor("BRL", "USD", cantidad) + " [USD]");
    }
}