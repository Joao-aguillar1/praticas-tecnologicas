import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero;
        
        // Verifica se a entrada é um número inteiro positivo
        try {
            numero = scanner.nextInt();
            if (numero < 0) {
                System.out.println("Por favor, digite um número inteiro positivo.");
            } else {
                long fatorial = calcularFatorial(numero);
                System.out.printf("O fatorial de %d é: %d%n", numero, fatorial);
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
        } finally {
            scanner.close();
        }
    }

    // Função para calcular o fatorial
    public static long calcularFatorial(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}