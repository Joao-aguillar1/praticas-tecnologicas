import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double totalNotas = 0;
        int quantidadeNotas = 0;
        String continuar;

        do {
            System.out.print("Insira uma nota (0 a 10): ");
            double nota = scanner.nextDouble();
            
            if (nota >= 0 && nota <= 10) {
                totalNotas += nota;
                quantidadeNotas++;
            } else {
                System.out.println("Nota inválida! Por favor, insira uma nota entre 0 e 10.");
            }

            System.out.print("Deseja inserir outra nota? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        if (quantidadeNotas > 0) {
            double media = totalNotas / quantidadeNotas;
            System.out.printf("A média das notas inseridas é: %.2f%n", media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }

        scanner.close();
    }
}