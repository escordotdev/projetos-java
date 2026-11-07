import java.util.Scanner;

public class ClassificaçãoEtária {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CLASSIFICAÇÃO ETÁRIA");

        System.out.print("Qual sua idade? ");
        int idade = scanner.nextInt();

        if (idade < 0){
            System.out.println("RESULTADO INVÁLIDO - (números negativos não são considerados)");
        }
        else if (idade <= 11 ){
            System.out.println("CRIANÇA.");
        }
        else if (idade <= 17) {
            System.out.println("ADOLESCENTE.");
        }
        else if (idade <= 59) {
            System.out.println("ADULTO.");
        }
        else if (idade < 150){
            System.out.println("IDOSO.");
        }
        else {
            System.out.println("IDADE NÃO CONSIDERADA EM NOSSO BANCO DE DADOS!");
        }


        scanner.close();
    }
}
