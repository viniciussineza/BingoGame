import java.util.Scanner;

public class GerarSorteio {

    // TRAZER NUMERO ALEATORIO
    // TRAZER CARTELA
    // METODO PUBLICO PARA RETORNAR GANHADOR (POSICAO DA LINHA == POSICAO JOGADOR ARRAY)
    private static Scanner scan = new Scanner(System.in);
    private static int numeroSorteado = GerarNumerosComuns.numeroRandom();

    public static int[][] validacaoGanhador(int[][] cartela, String[] jogador, int[][] validacaoGanhador) {

        boolean cartelaGanhador = false;
        int c = 0;
        while (!cartelaGanhador) {

            System.out.printf("SORTEIO %d: %d\n", c + 1, numeroSorteado);

            for (int i = 0; i < cartela.length ; i++) {
                for (int j = 0; j < cartela[i].length; j++) {
                    if (numeroSorteado == cartela[i][j]) {
                        validacaoGanhador[i][j] = 1;
                    }
                }
            }
            System.out.println("PONTUAÇÃO ATUAL: ");
            for (int i = 0; i < validacaoGanhador.length; i++) {
                System.out.printf("%s : [", jogador[i]);
                for(int j = 0; j < validacaoGanhador[i].length; j++) {
                    System.out.printf(" %d", validacaoGanhador[i][j]);
                }
                System.out.printf(" ]%n");
            }

            for (int i = 0; i < validacaoGanhador.length; i++) {
                int somaValidacao = 0;
                for (int j = 0; j < validacaoGanhador[i].length; j++) {
                    somaValidacao = somaValidacao + validacaoGanhador[i][j];
                    if (somaValidacao == 5) {
                        cartelaGanhador = true;
                        System.out.printf("O Ganhador é %s%n", jogador[i]);
                    }
                }
            }

            System.out.printf("Deseja Continuar?%nDigite%n1 - continuar%n2 - Encerrar o programa:%n");
            int opcao = scan.nextInt();

            if (opcao == 1) {
                numeroSorteado = GerarNumerosComuns.numeroRandom();
                c++;
            } else {
                System.out.println("Fim de jogo!");
                break;
            }

        }

        return validacaoGanhador;

        // assim que a linha estiver tudo 1, virar de false para true e retornar a posição do array ganhadora para comparar com o array de nomes e imprimir.
    }

}
