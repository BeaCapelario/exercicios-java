import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        
        String classificacao = 
            idade >= 0 && idade <= 14 ? "Criança" :
            idade >= 15 && idade <= 17 ? "Adolescente" :
            idade >= 18 && idade <= 30 ? "Adulto jovem" :
            idade > 30 ? "Adulto" : "Idade inválida";
        
        System.out.println("Classificação: " + classificacao);
        
        scanner.close();
    }
}