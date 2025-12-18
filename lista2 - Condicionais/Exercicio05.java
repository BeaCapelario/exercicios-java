import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantidade atual em estoque: ");
        int atual = scanner.nextInt();
        
        System.out.print("Quantidade máxima em estoque: ");
        int maxima = scanner.nextInt();
        
        System.out.print("Quantidade mínima em estoque: ");
        int minima = scanner.nextInt();
        
        double media = (maxima + minima) / 2.0;
        
        String mensagem = atual >= media ? "Não efetuar compra" : "Efetuar compra";
        
        System.out.println("Quantidade média: " + media);
        System.out.println("Decisão: " + mensagem);
        
        scanner.close();
    }
}