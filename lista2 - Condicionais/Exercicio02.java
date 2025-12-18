import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Valor unitário do produto: R$ ");
        double valorUnitario = scanner.nextDouble();
        
        System.out.print("Quantidade desejada: ");
        int quantidade = scanner.nextInt();
        
        double valorTotal = quantidade <= 12 ? 
            valorUnitario * quantidade : 
            (valorUnitario * 0.9) * quantidade;
        
        System.out.printf("Valor total da compra: R$ %.2f\n", valorTotal);
        
        scanner.close();
    }
}