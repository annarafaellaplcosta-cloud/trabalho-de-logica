import java.util.Scanner;

public class MetrosParaCentimetros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double metros, centimetros;

        System.out.print("Informe a medida em metros: ");
        metros = entrada.nextDouble();

        centimetros = metros * 100;

        System.out.println("Medida em centímetros: " + centimetros);
    }
}