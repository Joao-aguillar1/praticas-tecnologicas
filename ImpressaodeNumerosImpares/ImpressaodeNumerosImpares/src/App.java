public class App {
    public static void main(String[] args) {
        // Imprimindo os números ímpares entre 1 e 100
        System.out.println("Números ímpares de 1 a 100:");

        // Usando um loop para percorrer os números de 1 a 100
        for (int num = 1; num <= 100; num++) {
            if (num % 2 != 0) { // Verifica se o número é ímpar
                System.out.println(num); // Imprime o número ímpar em uma nova linha
            }
        }

        // CÓDIGO ADICIONAL PARA IMPRIMIR EM UMA ÚNICA LINHA SEPARADO POR VÍRGULAS:
        System.out.print("Números ímpares de 1 a 100 separados por vírgulas: ");
        
        for (int num = 1; num <= 100; num++) {
            if (num % 2 != 0) { // Verifica se o número é ímpar
                System.out.print(num); // Imprime o número ímpar
                if (num < 99) { // Se não for o último número, imprime uma vírgula
                    System.out.print(", ");
                }
            }
        }

        System.out.println(); // Para terminar a linha após a impressão
    }
}
