import java.util.Scanner;
import java.util.Random;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSorte = random.nextInt(100) + 1;
        
        System.out.print("Adivinhe o número da sorte (01 a 100): ");
        int palpite = scanner.nextInt();
        
        System.out.println("Número da sorte: " + String.format("%02d", numeroSorte));
        System.out.println(palpite == numeroSorte ? "Você acertou!" : "Você errou.");
        
        scanner.close();
    }
}