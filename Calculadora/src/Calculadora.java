
public class Calculadora {

    public static int divisao(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return dividendo / divisor;
    }
}