import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Gols do Time A: ");
        int timeA = scanner.nextInt();
        
        System.out.print("Gols do Time B: ");
        int timeB = scanner.nextInt();
        
        String resultado = 
            timeA > timeB ? "Time A venceu!" :
            timeB > timeA ? "Time B venceu!" :
            "Empate!";
        
        System.out.println("Resultado: " + resultado);
        
        scanner.close();
    }
}