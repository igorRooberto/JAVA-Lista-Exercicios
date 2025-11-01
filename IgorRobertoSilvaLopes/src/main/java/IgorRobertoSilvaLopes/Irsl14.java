package IgorRobertoSilvaLopes;

public class Irsl14 {

    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("* Aluno: Igor Roberto Silva Lopes - RA : 0025417");
        System.out.println("* Classe IRSL14 - Números pares de 0 a 50");
        System.out.println("*******************************************************************");

        System.out.println("Números pares de 0 a 50:");
        for (int i = 0; i <= 50; i += 2) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
