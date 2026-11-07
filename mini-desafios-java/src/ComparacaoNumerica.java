import java.util.Scanner;

public class ComparacaoNumerica {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite mais um número inteiro: ");
        int segundoNumero = scanner.nextInt();

        if (primeiroNumero == segundoNumero) {
            System.out.println("O número " + segundoNumero + " é igual ao número " + primeiroNumero + "!");
        } else if (primeiroNumero > segundoNumero) {
            System.out.println("O número " + primeiroNumero + " é maior que o número " + segundoNumero + "!");
        } else {
            System.out.println("O número " + segundoNumero + " é maior que o número " + primeiroNumero + "!");
        }
        scanner.close();
    }
}
