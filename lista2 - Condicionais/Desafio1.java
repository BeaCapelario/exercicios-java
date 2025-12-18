import java.util.Scanner;
import java.util.Random;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSorte = random.nextInt(100) + 1;
        boolean acertou = false;
        
        System.out.println("Tente adivinhar o número da sorte (1 a 100)");
        System.out.println("Você tem 3 chances!\n");
        
        for (int tentativa = 1; tentativa <= 3; tentativa++) {
            System.out.print("Tentativa " + tentativa + ": ");
            int palpite = scanner.nextInt();
            
            if (palpite == numeroSorte) {
                System.out.println("\nParabéns! Você acertou!");
                acertou = true;
                break;
            } else {
                System.out.println(palpite < numeroSorte ? "Tente um número maior!" : "Tente um número menor!");
            }
        }
        
        if (!acertou) {
            System.out.println("\nSuas chances acabaram! O número era: " + numeroSorte);
        }
        
        scanner.close();
    }
}