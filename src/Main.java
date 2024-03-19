import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número..: ");

        int num = scanner.nextInt();

        if (isFibonacci(num)) {
            System.out.println("O numero " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O numero " + num + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean isFibonacci(int num) {
        if (num != 0 && num != 1) {
            int anterior = 0;

            int prox;
            for(int atual = 1; atual <= num; atual = prox) {
                prox = anterior + atual;
                if (prox == num) {
                    return true;
                }

                anterior = atual;
            }

            return false;

        } else {
            return true;
        }
    }
}