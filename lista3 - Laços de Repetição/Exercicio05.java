import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int saldoPositivo = 0;
        int saldoNegativo = 0;
        int totalPessoas = 0;
        
        System.out.println("=== ANÁLISE DE SALDOS ===\n");
        
        char continuar = 'S';
        
        while (continuar == 'S' || continuar == 's') {
            System.out.print("Digite o saldo da pessoa " + (totalPessoas + 1) + ": R$ ");
            double saldo = scanner.nextDouble();
            
            totalPessoas++;
            
            if (saldo >= 0) {
                saldoPositivo++;
            } else {
                saldoNegativo++;
            }
            
            System.out.print("\nDeseja informar outro saldo (S/N)? ");
            scanner.nextLine(); // limpar buffer
            String resposta = scanner.nextLine();
            
            if (resposta.length() > 0) {
                continuar = resposta.charAt(0);
            } else {
                continuar = 'N';
            }
            
            System.out.println();
        }
        
        // Cálculo da porcentagem
        double percentPositivo = (double) saldoPositivo / totalPessoas * 100;
        
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Total de pessoas analisadas: " + totalPessoas);
        System.out.println("Pessoas com saldo positivo: " + saldoPositivo);
        System.out.println("Pessoas com saldo negativo: " + saldoNegativo);
        System.out.println("Porcentagem com saldo positivo: " + String.format("%.1f", percentPositivo) + "%");
        
        System.out.println("\n=== CLASSIFICAÇÃO DE RISCO ===");
        if (percentPositivo >= 50.0) {
            System.out.println("Nenhum risco!");
        } else {
            System.out.println("Risco ao banco!");
        }
        
        scanner.close();
    }
}