package Aula3;

public class RotacionarMatriz {
    public static void main(String[] args) {
        // Definindo a matriz 3x3
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Exibindo a matriz original
        System.out.println("Matriz Original:");
        exibirMatriz(matriz);

        // Rotacionando a matriz em 90 graus no sentido horário
        rotacionarMatriz(matriz);

        // Exibindo a matriz rotacionada
        System.out.println("\nMatriz Rotacionada (90 graus):");
        exibirMatriz(matriz);
    }

    // Função para rotacionar a matriz em 90 graus no sentido horário
    public static void rotacionarMatriz(int[][] matriz) {
        int n = matriz.length; // O tamanho da matriz 3x3 é 3

        // Fazendo a rotação em 90 graus no sentido horário
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                // Salvando o valor atual da posição
                int temp = matriz[i][j];

                // Movendo os valores de cada camada da matriz
                matriz[i][j] = matriz[n - j - 1][i];
                matriz[n - j - 1][i] = matriz[n - i - 1][n - j - 1];
                matriz[n - i - 1][n - j - 1] = matriz[j][n - i - 1];
                matriz[j][n - i - 1] = temp;
            }
        }
    }

    // Função para exibir a matriz no console
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
