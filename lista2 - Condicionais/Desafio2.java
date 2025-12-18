import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Perguntas e respostas - usando letras como opções
        String[][] perguntas = {
            {
                "Qual é a capital do Brasil?",
                "a) Rio de Janeiro",
                "b) São Paulo", 
                "c) Brasília",
                "c"
            },
            {
                "Quantos lados tem um triângulo?",
                "a) 2 lados",
                "b) 3 lados",
                "c) 4 lados",
                "b"
            }
        };
        
        System.out.println("=== QUIZ SHOSTNERS AND SHOSTNERS ===\n");
        System.out.println("Escolha qual pergunta responder:");
        System.out.println("1 - Primeira pergunta");
        System.out.println("2 - Segunda pergunta");
        System.out.print("Opção: ");
        
        String opcaoStr = scanner.next();
        String opcaoMinuscula = opcaoStr.toLowerCase();
        
        if (opcaoMinuscula.equals("1") || opcaoMinuscula.equals("um")) {
            int indice = 0;
            
            System.out.println("\n" + perguntas[indice][0]);
            System.out.println(perguntas[indice][1]);
            System.out.println(perguntas[indice][2]);
            System.out.println(perguntas[indice][3]);
            
            System.out.print("\nSua resposta (a, b ou c): ");
            String resposta = scanner.next().toLowerCase();
            
            System.out.println(resposta.equals(perguntas[indice][4]) ? 
                "\nVocê acertou, pode retirar seu bônus na Shostners and Shostners!" :
                "\nVocê não acertou, mas tente novamente numa próxima.");
                
        } else if (opcaoMinuscula.equals("2") || opcaoMinuscula.equals("dois")) {
            int indice = 1;
            
            System.out.println("\n" + perguntas[indice][0]);
            System.out.println(perguntas[indice][1]);
            System.out.println(perguntas[indice][2]);
            System.out.println(perguntas[indice][3]);
            
            System.out.print("\nSua resposta (a, b ou c): ");
            String resposta = scanner.next().toLowerCase();
            
            System.out.println(resposta.equals(perguntas[indice][4]) ? 
                "\nVocê acertou, pode retirar seu bônus na Shostners and Shostners!" :
                "\nVocê não acertou, mas tente novamente numa próxima.");
                
        } else {
            System.out.println("Opção inválida!");
        }
        
        scanner.close();
    }
}