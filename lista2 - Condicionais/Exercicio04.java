import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorBase = 3000.00;
        
        System.out.println("Escolha o destino:");
        System.out.println("1 - Maceió");
        System.out.println("2 - Porto de Galinhas");
        System.out.print("Opção: ");
        int destino = scanner.nextInt();
        
        System.out.println("\nIncluir almoço/janta?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.print("Opção: ");
        int refeicao = scanner.nextInt();
        
        double percentual = 
            destino == 1 && refeicao == 1 ? 1.00 :
            destino == 1 && refeicao == 2 ? 0.85 :
            destino == 2 && refeicao == 1 ? 0.60 :
            destino == 2 && refeicao == 2 ? 0.45 : 0;
        
        double valorFinal = valorBase + (valorBase * percentual);
        
        System.out.printf("\nValor total da viagem: R$ %.2f\n", valorFinal);
        
        scanner.close();
    }
}