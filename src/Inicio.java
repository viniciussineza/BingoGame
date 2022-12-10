import java.util.Scanner;

public class Inicio {

    private static Scanner scan = new Scanner(System.in);

    public static int modoDeJogo() {

        System.out.println("************************ MODO DE JOGO ************************");
        System.out.println("Por favor, confirme o modo de jogo:");
        System.out.println("Escolha a opção:\n1 - AUTOMATICO\n2 - MANUAL");
        int opModoDeJogo = scan.nextInt();

        return opModoDeJogo;
    }


}
