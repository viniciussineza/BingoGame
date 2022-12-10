
public class GerarCartelas {

    private static int TAMANHO_CARTELA = 5;
    public static int[][] cartelaAutomatica(String[] numeroJogadores) {

        int[][] cartela = new int[numeroJogadores.length][TAMANHO_CARTELA];

        for (int i = 0; i < numeroJogadores.length; i++) {

            for (int j = 0; j < TAMANHO_CARTELA; j++) {

                int numeroSorteado = GerarNumerosComuns.numeroRandom();
                int c = 0;
                while (c < TAMANHO_CARTELA) {

                    if (numeroSorteado == cartela[i][j]) {
                        numeroSorteado = GerarNumerosComuns.numeroRandom();
                        c = 0;
                    } else {
                        c++;
                    }
                }

                cartela[i][j] = numeroSorteado;

            }

        }

        return cartela;
    }

}
