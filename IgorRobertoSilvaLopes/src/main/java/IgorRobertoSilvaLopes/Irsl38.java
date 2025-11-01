package IgorRobertoSilvaLopes;

import java.util.Scanner;

public class Irsl38 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Igor Roberto Silva Lopes - RA : 0025417");
        System.out.println("* Classe IRSL38 - Confirmar saída com 's'");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("\n-- MENU PRINCIPAL --");
            System.out.println("Processando dados...");
            System.out.println("--------------------");
            System.out.print("Deseja sair do sistema? (s/n): ");
            resposta = scanner.nextLine();

        } while (!resposta.equalsIgnoreCase("s"));

        System.out.println("Encerrando o sistema...");
        scanner.close();
    }
}
