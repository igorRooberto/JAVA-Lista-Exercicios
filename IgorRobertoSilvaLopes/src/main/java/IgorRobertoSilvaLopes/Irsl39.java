package IgorRobertoSilvaLopes;

import java.util.Scanner;

public class Irsl39 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Igor Roberto Silva Lopes - RA : 0025417");
        System.out.println("* Classe IRSL39 - Validar número entre 1 e 5");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um numero entre 1 e 5: ");
            numero = scanner.nextInt();

            if (numero < 1 || numero > 5) {
                System.out.println("Valor invalido. Tente novamente.");
            }

        } while (numero < 1 || numero > 5);

        System.out.println("Voce digitou o numero valido: " + numero);
        scanner.close();
    }
}
