import java.io.IOException;
import java.util.Scanner;

public class DolarARealBrasileno {

    public void dolarARealBrasileno() throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor que desea convertir:");
        int cantidad = scanner.nextInt();

        Conversor conversor = new Conversor();

        System.out.println("El valor " + cantidad + " [USD] " + "corresponde al valor final de: "
                + "$" + conversor.conversor("USD", "BRL", cantidad) + " real brasileño");
    }
}