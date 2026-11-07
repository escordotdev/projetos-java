import java.util.Scanner;

public class ParEMultiplo {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();

        if (numeroInteiro % 6 ==0){
            System.out.println("O número " + numeroInteiro + " é par e múltiplo de 3");
        }
        else {
            System.out.println("O número " + numeroInteiro + " não é par e múltiplo de 3 ao mesmo tempo");
        }


        scanner.close();

    }
}
