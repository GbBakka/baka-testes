import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valoresValidos = 0;
        int soma = 0;

        while (valoresValidos < 1) {
            try {
                System.out.println("Insira dois números inteiros: ");
                int firstNumber = sc.nextInt();
                int secondNumber = sc.nextInt();

                System.out.println("Você inseriu: " + firstNumber + " e " + secondNumber);

                soma = firstNumber + secondNumber;
                valoresValidos++;
            } catch (InputMismatchException e) {
                System.out.println("Erro: insira apenas números inteiros.");
                sc.nextLine();
            }
        }

        sc.close();
        System.out.println("Resultado: " + soma);
    }
}
