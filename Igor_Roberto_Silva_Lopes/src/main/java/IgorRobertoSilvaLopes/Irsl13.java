package IgorRobertoSilvaLopes;

public class Irsl13 {

    public static void main(String[] args) {

        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Igor Roberto Silva Lopes - RA : 0025417");
        System.out.println("* Classe IRSL13 - Soma dos 100 primeiros números naturais");
        System.out.println("*******************************************************************");

        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
