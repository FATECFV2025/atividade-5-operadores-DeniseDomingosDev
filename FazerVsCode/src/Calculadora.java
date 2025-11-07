package Tarefa5;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Operadores op = new Operadores();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CALCULADORA JAVA ===");
        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();

        System.out.println("\nSoma: " + op.somar(a, b));
        System.out.println("Subtração: " + op.subtrair(a, b));
        System.out.println("Multiplicação: " + op.multiplicar(a, b));
        System.out.println("Divisão: " + op.dividir(a, b));
        System.out.println("Módulo: " + op.modulo(a, b));

        System.out.println("\n=== Operadores de Atribuição ===");
        System.out.println("a += b → " + op.atribuirSoma((int)a, (int)b));
        System.out.println("a -= b → " + op.atribuirSubtracao((int)a, (int)b));

        System.out.println("\n=== Operadores Lógicos ===");
        System.out.println("true && false → " + op.eLogico(true, false));
        System.out.println("true || false → " + op.ouLogico(true, false));
        System.out.println("!true → " + op.naoLogico(true));

        System.out.println("\n=== Operadores de Comparação ===");
        System.out.println("a == b → " + op.igual((int)a, (int)b));
        System.out.println("a != b → " + op.diferente((int)a, (int)b));
        System.out.println("a > b → " + op.maior((int)a, (int)b));
        System.out.println("a < b → " + op.menor((int)a, (int)b));

        sc.close();
    }
}

