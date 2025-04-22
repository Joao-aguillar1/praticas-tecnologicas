public class App {
    public static void main(String[] args) {
        int a = 0; // Primeiro número da sequência
        int b = 1; // Segundo número da sequência
        int count = 0; // Contador para os números impressos
        int n = 10; // Número de termos a serem impressos

        System.out.println("Os 10 primeiros números da sequência de Fibonacci sao:");

        while (count < n) {
            System.out.println(a); // Imprime o número atual
            int next = a + b; // Calcula o próximo número da sequência
            a = b; // Atualiza 'a' para o próximo número
            b = next; // Atualiza 'b' para o próximo número
            count++; // Incrementa o contador
        }
    }
}
