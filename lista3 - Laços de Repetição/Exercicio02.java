import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contadorIdade = 0;
        int contadorAltura = 0;
        int contadorPeso = 0;
        
        System.out.println("=== ANÁLISE DE 10 PESSOAS ===\n");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i + ":");
            
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            
            System.out.print("Altura (em metros, ex: 1.75): ");
            double altura = scanner.nextDouble();
            
            System.out.print("Peso (em kg): ");
            double peso = scanner.nextDouble();
            
            if (idade > 50) {
                contadorIdade++;
            }
            
            if (altura > 1.60) {
                contadorAltura++;
            }
            
            if (peso < 80) {
                contadorPeso++;
            }
            
            System.out.println(); // linha em branco
        }
        
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("a. Pessoas com idade acima de 50 anos: " + contadorIdade);
        System.out.println("b. Pessoas com altura acima de 1.60m: " + contadorAltura);
        System.out.println("c. Pessoas com peso abaixo de 80kg: " + contadorPeso);
        
        scanner.close();
    }
}