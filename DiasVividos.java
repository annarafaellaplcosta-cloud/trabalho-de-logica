import java.util.Scanner;

public class DiasVividos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade, dias;

        System.out.print("Informe sua idade em anos: ");
        idade = entrada.nextInt();

        dias = idade * 365;

        System.out.println("Você viveu aproximadamente " + dias + " dias.");
    }
}