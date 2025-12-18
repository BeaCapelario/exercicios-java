import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contadorOtimo = 0;
        int contadorBom = 0;
        int contadorRuim = 0;
        int totalRespondentes = 0;
        int somaNotas = 0;
        
        System.out.println("=== PESQUISA DE OPINIÃO SOBRE O FILME ===\n");
        
        char continuar = 'S';
        
        while (continuar == 'S' || continuar == 's') {
            System.out.println("Qual sua opinião sobre o filme?");
            System.out.println("1 - Ótimo");
            System.out.println("2 - Bom");
            System.out.println("3 - Ruim");
            System.out.print("Opção: ");
            
            int opcao;
            while (true) {
                opcao = scanner.nextInt();
                if (opcao >= 1 && opcao <= 3) {
                    break;
                }
                System.out.print("Opção inválida! Digite 1, 2 ou 3: ");
            }
            
            totalRespondentes++;
            somaNotas += opcao;
            
            if (opcao == 1) {
                contadorOtimo++;
            } else if (opcao == 2) {
                contadorBom++;
            } else {
                contadorRuim++;
            }
            
            System.out.print("\nDeseja continuar (S/N)? ");
            scanner.nextLine(); // limpar buffer
            String resposta = scanner.nextLine();
            
            if (resposta.length() > 0) {
                continuar = resposta.charAt(0);
            } else {
                continuar = 'N';
            }
            
            System.out.println();
        }
        
        // Cálculos
        double percentOtimo = (double) contadorOtimo / totalRespondentes * 100;
        double percentBom = (double) contadorBom / totalRespondentes * 100;
        double percentRuim = (double) contadorRuim / totalRespondentes * 100;
        double mediaNotas = (double) somaNotas / totalRespondentes;
        
        // Resultados
        System.out.println("\n=== RESULTADOS DA PESQUISA ===");
        System.out.println("a. Ótimo: " + contadorOtimo + " pessoas (" + String.format("%.1f", percentOtimo) + "%)");
        System.out.println("b. Bom: " + contadorBom + " pessoas (" + String.format("%.1f", percentBom) + "%)");
        System.out.println("c. Ruim: " + contadorRuim + " pessoas (" + String.format("%.1f", percentRuim) + "%)");
        System.out.println("d. Total de respondentes: " + totalRespondentes);
        System.out.println("e. Média de notas: " + String.format("%.2f", mediaNotas));
        
        scanner.close();
    }
}