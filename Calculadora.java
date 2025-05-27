public class Calculadora {
    public int suma(int a, int b) {
        return a + b;
    }
    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }
    public int dividir(int a, int b) {
    if (b == 0) {
        throw new ArithmeticException("No se puede dividir entre cero");
    }
    return a / b;
}
}