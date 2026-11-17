import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.print("Informe um número inteiro: ");
        numero = entrada.nextInt();

        System.out.println("Antecessor: " + (numero - 1));
        System.out.println("Sucessor: " + (numero + 1));
    }
}