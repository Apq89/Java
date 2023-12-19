import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir as informações ao Aluno
        System.out.println("Necessito de algumas Informações!");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("Nota do Teste em Precentagem: ");
        float notaTeste = scanner.nextFloat();

        // Mostrar as informações fornecidas pelo Aluno
        System.out.println("\nInformações do Estudante:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota Final " + notaTeste);

        // Verificar a condição da nota
        if (notaTeste >= 50) {
            System.out.println("Parabéns! Você foi aprovado!");
        } else {
            System.out.println("Infelizmente, você não atingiu a nota mínima para aprovação.");
        }


        // Fechar o scanner
        scanner.close();
    }
}
