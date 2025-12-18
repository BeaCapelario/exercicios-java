import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Base: ");
        int base = scanner.nextInt();
        
        System.out.print("Expoente: ");
        int expoente = scanner.nextInt();
        
        // Método 1: Math.pow() - retorna double
        double resultado1 = Math.pow(base, expoente);
        
        // Método 2: Usando loop - retorna int
        int resultado2 = 1;
        for (int i = 0; i < expoente; i++) {
            resultado2 *= base;
        }
        
        // Método 3: Math.pow com conversão
        int resultado3 = (int) Math.pow(base, expoente);
        
        System.out.println("\nResultados da potenciação:");
        System.out.println("Com Math.pow(): " + base + "^" + expoente + " = " + resultado1);
        System.out.println("Com loop for: " + base + "^" + expoente + " = " + resultado2);
        System.out.println("Com Math.pow convertido: " + base + "^" + expoente + " = " + resultado3);
        
        scanner.close();
    }
}