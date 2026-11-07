import java.util.Scanner;

public class ParOuImpar {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE UM NÚMERO INTEIRO: ");
        int numeroInteiro = scanner.nextInt();

        if (numeroInteiro % 2 == 0) {
            System.out.println(numeroInteiro + " é um número par!");
        } else {
            System.out.println(numeroInteiro + " é um número ímpar!");
        }

        scanner.close();
    }

}
