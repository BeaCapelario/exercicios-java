import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CADASTRO PARA VAGA NA BOSCH ===\n");
        
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Sobrenome: ");
        String sobrenome = scanner.nextLine();
        
        System.out.print("Data de Nascimento (DD/MM/AAAA): ");
        String dataNascimento = scanner.nextLine();
        
        System.out.print("Pretensão Salarial (R$): ");
        double pretensaoSalarial = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Grau de Instrução (Ensino Médio, Ensino Técnico ou Ensino Superior): ");
        String grauInstrucao = scanner.nextLine();
        
        System.out.print("Cargo Pretendido: ");
        String cargoPretendido = scanner.nextLine();
        
        System.out.print("Possui CNH do tipo B? (sim ou não): ");
        String possuiCNH = scanner.nextLine();
        
        System.out.println("\n=== RESUMO DO CADASTRO ===\n");
        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.printf("Pretensão Salarial: R$ %.2f%n", pretensaoSalarial);
        System.out.println("Grau de Instrução: " + grauInstrucao);
        System.out.println("Cargo Pretendido: " + cargoPretendido);
        System.out.println("Possui CNH tipo B: " + possuiCNH);
        System.out.println("\n=== CADASTRO CONCLUÍDO COM SUCESSO! ===");
        
        scanner.close();
    }
}