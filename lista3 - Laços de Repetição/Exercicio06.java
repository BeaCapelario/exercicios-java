import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== TABUADA ===\n");
        
        int numero;
        while (true) {
            System.out.print("Digite um número para ver sua tabuada: ");
            numero = scanner.nextInt();
            break; 
        }
        
        System.out.println("\nTabuada do " + numero + ":\n");
        
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        scanner.close();
    }
}