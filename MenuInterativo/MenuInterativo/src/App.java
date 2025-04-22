import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar");
            System.out.println("2. Remover");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Acao 'Adicionar' realizada.");
                    break;
                case 2:
                    System.out.println("Acao 'Remover' realizada.");
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}