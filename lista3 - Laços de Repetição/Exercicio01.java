import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        
        System.out.println("=== ANÁLISE DE NÚMEROS ===\n");
        System.out.println("Digite 10 números inteiros:");
        
        // Coletar os 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        while (true) {
            System.out.println("\n=== MENU DE OPÇÕES ===");
            System.out.println("a. Quantos números pares?");
            System.out.println("b. Quantos números ímpares?");
            System.out.println("c. Quantos negativos?");
            System.out.println("d. Quantos positivos?");
            System.out.println("e. Sair do programa");
            System.out.print("\nEscolha uma opção: ");
            
            String opcao = scanner.next().toLowerCase();
            
            if (opcao.equals("a")) {
                int contador = 0;
                for (int num : numeros) {
                    if (num % 2 == 0) {
                        contador++;
                    }
                }
                System.out.println("Quantidade de números pares: " + contador);
                
            } else if (opcao.equals("b")) {
                int contador = 0;
                for (int num : numeros) {
                    if (num % 2 != 0) {
                        contador++;
                    }
                }
                System.out.println("Quantidade de números ímpares: " + contador);
                
            } else if (opcao.equals("c")) {
                int contador = 0;
                for (int num : numeros) {
                    if (num < 0) {
                        contador++;
                    }
                }
                System.out.println("Quantidade de números negativos: " + contador);
                
            } else if (opcao.equals("d")) {
                int contador = 0;
                for (int num : numeros) {
                    if (num > 0) {
                        contador++;
                    }
                }
                System.out.println("Quantidade de números positivos: " + contador);
                
            } else if (opcao.equals("e")) {
                System.out.println("Encerrando o programa...");
                System.exit(0);
                
            } else {
                System.out.println("Opção inválida! Digite a, b, c, d ou e.");
            }
            
            System.out.print("\nPressione Enter para continuar...");
            scanner.nextLine();
            scanner.nextLine();
        }
    }
}