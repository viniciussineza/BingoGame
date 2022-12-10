import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    private static int TAMANHO_CARTELA = 5;


    public static void main(String[] args) {


        System.out.println("****************** BEM VINDO AO BINGO TECH! ******************");

        System.out.println("Informe o nome dos jogadores: ");
        String entradaJogadores = scan.next();
        String[] jogador = entradaJogadores.split("-");

        int[][] cartela = new int[jogador.length][TAMANHO_CARTELA];

        int opcao = Inicio.modoDeJogo();

        if ( opcao == 1 ) {
            // Gerar Cartelas Automaticas
            cartela = GerarCartelas.cartelaAutomatica(jogador);
        } else {
            System.out.println("Falta implantar");
        }

        // Imprimir Cartelas e Jogadores
        for (int i = 0; i < cartela.length; i++) {

            System.out.print(jogador[i] + " : [");
            for (int j = 0; j < cartela[i].length; j++) {
                System.out.print(" " + cartela[i][j]);
            }

            System.out.print(" ].\n");

        }

        System.out.println("*************************** SORTEIO ***************************");
        int[][] validacaoGanhador = GerarNumerosComuns.validacaoGanhador(jogador);
        GerarSorteio.validacaoGanhador(cartela, jogador, validacaoGanhador);

    }
}

