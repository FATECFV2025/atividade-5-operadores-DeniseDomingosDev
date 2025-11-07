package Tarefa5;
public class Operadores {

    public double somar(double a, double b) {
        return a + b;
    }
    public double subtrair(double a, double b) {
        return a - b;
    }
    public double multiplicar(double a, double b) {
        return a * b;
    }
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return a / b;
    }
    public double modulo(double a, double b) {
        return a % b;
    }
    public int atribuirSoma(int a, int b) {
        return a += b;
    }
    public int atribuirSubtracao(int a, int b) {
        return a -= b;
    }
    public int atribuirMultiplicacao(int a, int b) {
        return a *= b;
    }
    public int atribuirDivisao(int a, int b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return a;
        }
        return a /= b;
    }
    public boolean eLogico(boolean a, boolean b) {
        return a && b;
    }
    public boolean ouLogico(boolean a, boolean b) {
        return a || b;
    }
    public boolean naoLogico(boolean a) {
        return !a;
    }
    public boolean igual(int a, int b) {
        return a == b;
    }
    public boolean diferente(int a, int b) {
        return a != b;
    }
    public boolean maior(int a, int b) {
        return a > b;
    }
    public boolean menor(int a, int b) {
        return a < b;
    }

    public boolean maiorOuIgual(int a, int b) {
        return a >= b;
    }
    public boolean menorOuIgual(int a, int b) {
        return a <= b;
    }
}
