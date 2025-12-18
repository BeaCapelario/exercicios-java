import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[][] perguntas = {
            {
                "Qual é a capital do Brasil?",
                "1) Rio de Janeiro",
                "2) São Paulo", 
                "3) Brasília",
                "3"
            },
            {
                "Quantos lados tem um triângulo?",
                "1) 2 lados",
                "2) 3 lados",
                "3) 4 lados",
                "2"
            }
        };
        
        System.out.println("=== QUIZ SHOSTNERS AND SHOSTNERS ===\n");
        System.out.println("Escolha qual pergunta responder:");
        System.out.println("1 - Primeira pergunta");
        System.out.println("2 - Segunda pergunta");
        System.out.print("Opção: ");
        
        int escolha = scanner.nextInt();
        
        if (escolha >= 1 && escolha <= 2) {
            int indice = escolha - 1;
            
            System.out.println("\n" + perguntas[indice][0]);
            System.out.println(perguntas[indice][1]);
            System.out.println(perguntas[indice][2]);
            System.out.println(perguntas[indice][3]);
            
            System.out.print("\nSua resposta (1, 2 ou 3): ");
            String resposta = scanner.next();
            
            System.out.println(resposta.equals(perguntas[indice][4]) ? 
                "\nVocê acertou, pode retirar seu bônus na Shostners and Shostners!" :
                "\nVocê não acertou, mas tente novamente numa próxima.");
        } else {
            System.out.println("Opção inválida!");
        }
        
        scanner.close();
    }
}