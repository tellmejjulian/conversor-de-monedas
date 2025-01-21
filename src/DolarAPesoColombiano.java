import java.io.IOException;
import java.util.Scanner;

public class DolarAPesoColombiano {

    public void dolarAPesoColombiano() throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor que desea convertir:");
        int cantidad = scanner.nextInt();

        Conversor conversor = new Conversor();

        System.out.println("El valor de " + cantidad + " [USD], " + "corresponde al valor final de: "
                + "$" + conversor.conversor("USD", "COP", cantidad) + " Pesos Colombianos");
    }
}