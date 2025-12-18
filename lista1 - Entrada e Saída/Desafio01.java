import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Primeiro número: ");
        int a = scanner.nextInt();
        
        System.out.print("Segundo número: ");
        int b = scanner.nextInt();
        
        boolean podeDividir = b != 0;
        
        System.out.println(podeDividir ? "Divisão: " + ((double) a / b) : "A divisão não poderá ser realizada.");
        
        scanner.close();
    }
}