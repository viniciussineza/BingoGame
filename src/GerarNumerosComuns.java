import java.util.Random;

public class GerarNumerosComuns {

    private static Random random = new Random();
    private static int TAMANHO_CARTELA = 5;

    public static int[] numerosDisponiveis() {

        int QUANTIDADE_NUMEROS = 60;
        int[] numerosDisponiveis = new int[QUANTIDADE_NUMEROS];

        for (int i = 0; i < QUANTIDADE_NUMEROS; i++) {
            numerosDisponiveis[i] = i;
        }

        return numerosDisponiveis;
    }

    public static int numeroRandom() { return random.nextInt( numerosDisponiveis().length ); }

    public static int[][] validacaoGanhador(String[] jogador) {

        int[][] validacaoGanhador = new int[jogador.length][TAMANHO_CARTELA];

        for (int i = 0; i < jogador.length; i++) {
            for (int j = 0; j < TAMANHO_CARTELA; j++) {
                validacaoGanhador[i][j] = 0;
            }
        }

        return validacaoGanhador;
    }

}
