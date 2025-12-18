import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nomeMaisPesada = "";
        double pesoMaisPesada = 0;
        
        String nomeMaisAlta = "";
        double alturaMaisAlta = 0;
        
        System.out.println("=== ANÁLISE DE 6 PESSOAS ===\n");
        
        for (int i = 1; i <= 6; i++) {
            System.out.println("Pessoa " + i + ":");
            
            System.out.print("Nome: ");
            String nome = scanner.next();
            
            System.out.print("Altura (em metros, ex: 1.75): ");
            double altura = scanner.nextDouble();
            
            System.out.print("Peso (em kg): ");
            double peso = scanner.nextDouble();
            
            if (i == 1 || peso > pesoMaisPesada) {
                pesoMaisPesada = peso;
                nomeMaisPesada = nome;
            }
            
            if (i == 1 || altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                nomeMaisAlta = nome;
            }
            
            System.out.println();
        }
        
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Pessoa mais pesada:");
        System.out.println("Nome: " + nomeMaisPesada);
        System.out.println("Peso: " + pesoMaisPesada + " kg");
        
        System.out.println("\nPessoa mais alta:");
        System.out.println("Nome: " + nomeMaisAlta);
        System.out.println("Altura: " + alturaMaisAlta + " m");
        
        scanner.close();
    }
}