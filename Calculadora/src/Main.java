import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o dividendo (número inteiro): ");
            int dividendo = input.nextInt();

            System.out.println("Digite o divisor (número inteiro): ");
            int divisor = input.nextInt();

            int resultado = Calculadora.divisao(dividendo, divisor);
            System.out.println("O resultado: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Erro: você deve inserir apenas números inteiros.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Programa encerrado corretamente.");
        }
    }
}