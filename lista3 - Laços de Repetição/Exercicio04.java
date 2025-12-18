import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CONTADOR COM INCREMENTO ===\n");
        
        // Solicitar número
        int numero;
        while (true) {
            System.out.print("Digite um número positivo: ");
            numero = scanner.nextInt();
            if (numero > 0) {
                break;
            }
            System.out.println("Número inválido! Deve ser positivo.");
        }
        
        // Solicitar incremento
        int incremento;
        while (true) {
            System.out.print("Digite o incremento (positivo): ");
            incremento = scanner.nextInt();
            if (incremento > 0) {
                break;
            }
            System.out.println("Incremento inválido! Deve ser positivo.");
        }
        
        System.out.println("\n=== CONTAGEM ===");
        
        // Usando for para mostrar a contagem
        for (int i = 0; i <= numero; i += incremento) {
            System.out.print(i);
            if (i + incremento <= numero) {
                System.out.print(", ");
            }
        }
        
        System.out.println(); // pular linha no final
        
        scanner.close();
    }
}