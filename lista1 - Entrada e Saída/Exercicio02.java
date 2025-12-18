import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Primeiro número: ");
        int a = scanner.nextInt();
        
        System.out.print("Segundo número: ");
        int b = scanner.nextInt();
        
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + ((double) a / b));
        System.out.println("Potência: " + Math.pow(a, b));
        System.out.println("Resto: " + (a % b));
        
        scanner.close();
    }
}