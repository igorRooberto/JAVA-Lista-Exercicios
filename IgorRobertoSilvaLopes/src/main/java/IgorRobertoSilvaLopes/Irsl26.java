package IgorRobertoSilvaLopes;

import java.util.Scanner;

public class Irsl26 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Igor Roberto Silva Lopes - RA : 0025417");
        System.out.println("* Classe IRSL26 - Número primo com while");
        System.out.println("*******************************************************************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para verificar se e primo:");
        int numero = scanner.nextInt();
        boolean ePrimo = true;

        if (numero <= 1) {
            ePrimo = false;
        } else {
            int i = 2;
            while (i <= numero / 2) {
                if (numero % i == 0) {
                    ePrimo = false;
                    break;
                }
                i++;
            }
        }

        if (ePrimo) {
            System.out.println(numero + " e primo.");
        } else {
            System.out.println(numero + " nao e primo.");
        }
        scanner.close();
    }
}
