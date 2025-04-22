import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Senha fixa definida
        String senhaFixa = "1234";
        Scanner scanner = new Scanner(System.in);
        String senhaDigitada;

        // Loop para solicitar a senha
        while (true) {
            // Solicita que o usuário insira a senha
            System.out.print("Digite a senha para acessar o sistema: ");
            senhaDigitada = scanner.nextLine();

            // Verifica se a senha digitada está correta
            if (senhaDigitada.equals(senhaFixa)) {
                System.out.println("Acesso concedido");
                break; // Sai do loop se a senha estiver correta
            } else {
                System.out.println("Senha incorreta, tente novamente.");
            }
        }

        // Fecha o scanner ao final
        scanner.close();
    }
}
