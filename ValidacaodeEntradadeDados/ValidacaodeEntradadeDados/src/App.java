import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Por favor, insira um número entre 1 e 100: ");
            numero = scanner.nextInt();
            
            if (numero < 1 || numero > 100) {
                System.out.println("Número inválido! Tente novamente.");
            }
        } while (numero < 1 || numero > 100); // A condição do loop: continue enquanto o número não estiver no intervalo

        System.out.println("Número validado: " + numero);
        
        scanner.close(); // Fechamos o scanner
    }
}