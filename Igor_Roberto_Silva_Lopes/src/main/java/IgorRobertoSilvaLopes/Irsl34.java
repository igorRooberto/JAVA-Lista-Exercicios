package IgorRobertoSilvaLopes;

import java.util.Scanner;

public class Irsl34 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Igor Roberto Silva Lopes - RA : 0025417");
        System.out.println("* Classe IRSL34 - Pedir senha até acertar");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);
        int senhaDigitada;
        int senhaCorreta = 1111;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextInt();

            if (senhaDigitada != senhaCorreta) {
                System.out.println("Senha incorreta.");
            }

        } while (senhaDigitada != senhaCorreta);

        System.out.println("Acesso liberado!");
        scanner.close();
    }
}
