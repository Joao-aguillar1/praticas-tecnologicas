import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Cria um vetor de inteiros com tamanho 10
        int[] vetor = new int[10];
        
        // Solicita ao usuário para inserir 10 números inteiros
        System.out.println("Por favor, insira 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }
        
        // Inicializa a variável para armazenar a soma
        int somaTotal = 0;

        // Percorre o vetor e calcula a soma
        for (int num : vetor) {
            somaTotal += num;
        }

        // Exibe a soma total dos elementos
        System.out.println("A soma total dos elementos do vetor é: " + somaTotal);
        
        // Fecha o scanner
        scanner.close();
    }
}