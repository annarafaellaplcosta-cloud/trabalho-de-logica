import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.print("Informe a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.print("Informe a segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.print("Informe a terceira nota: ");
        nota3 = entrada.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Média: " + media);
    }
}