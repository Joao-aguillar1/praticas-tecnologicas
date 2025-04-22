import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0.0; // Variável para armazenar a soma dos números positivos

        while (true) {
            System.out.print("Digite um número positivo (ou um número negativo para encerrar): ");
            double numero = scanner.nextDouble(); // Lê o número do usuário

            if (numero < 0) {
                break; // Encerra o loop se o número for negativo
            }

            soma += numero; // Adiciona o número à soma se for positivo
        }

        System.out.println("A soma dos números positivos informados é: " + soma);
        scanner.close(); // Fecha o scanner
    }
}