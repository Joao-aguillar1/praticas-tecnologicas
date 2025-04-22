import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int numeroAleatorio = random.nextInt(20) + 1; // Sorteia um número entre 1 e 20
        int palpite;
        int tentativas = 0;

        do {
            System.out.print("Adivinhe um número entre 1 e 20: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite > numeroAleatorio) {
                System.out.println("O número é menor. Tente novamente.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é maior. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + " em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroAleatorio);

        scanner.close(); // Fechar o Scanner ao final
    }
}