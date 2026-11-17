import java.util.Scanner;

public class DadosUsuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;
        boolean ativa;

        System.out.print("Informe o nome de usuário: ");
        nome = entrada.nextLine();
        System.out.print("Informe a idade: ");
        idade = entrada.nextInt();
        System.out.print("A conta está ativa? (true ou false): ");
        ativa = entrada.nextBoolean();

        System.out.println("Usuário: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Conta ativa: " + ativa);
    }
}