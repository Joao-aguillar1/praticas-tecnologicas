import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                // Solicitar valores ao usuário
                System.out.print("Digite o valor do investimento inicial (P): ");
                double P = scanner.nextDouble();
                
                System.out.print("Digite a taxa de juros anual (r) em porcentagem: ");
                double r = scanner.nextDouble();
                
                System.out.print("Digite o período de investimento em anos (t): ");
                double t = scanner.nextDouble();
                
                System.out.print("O investimento será capitalizado de forma simples ou composta? (digite 'simples' ou 'composta'): ");
                String capitalizacao = scanner.next().trim().toLowerCase();

                // Calcular o montante (M) com base na escolha do usuário
                double M;
                if (capitalizacao.equals("simples")) {
                    M = P * (1 + (r / 100) * t);
                } else if (capitalizacao.equals("composta")) {
                    M = P * Math.pow((1 + (r / 100)), t);
                } else {
                    System.out.println("Opção de capitalização inválida. Por favor, escolha 'simples' ou 'composta'.");
                    continue; // Volta para o início do loop
                }

                // Exibir o resultado
                System.out.printf("%nTipo de capitalização: %s%n", capitalizacao.substring(0, 1).toUpperCase() + capitalizacao.substring(1));
                System.out.printf("Valor do investimento inicial (P): R$ %.2f%n", P);
                System.out.printf("Taxa de juros anual (r): %.2f%%%n", r);
                System.out.printf("Período de investimento (t): %.2f anos%n", t);
                System.out.printf("Montante ao final do período (M): R$ %.2f%n%n", M);

                // Perguntar se o usuário deseja realizar um novo cálculo
                System.out.print("Deseja realizar um novo cálculo? (digite 'sim' para continuar ou qualquer outra tecla para sair): ");
                String novaCalculo = scanner.next().trim().toLowerCase();
                continuar = novaCalculo.equals("sim");
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, insira valores numéricos válidos.");
                scanner.next(); // Limpa o buffer do scanner
            }
        }

        System.out.println("Obrigado por usar a calculadora de rendimento. Até logo!");
        scanner.close();
    }
}