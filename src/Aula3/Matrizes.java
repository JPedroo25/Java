package Aula3;

public class Matrizes {
    public static void main(String[] args) {
    int[][] matriz = {
        {10, 20, 30},
        {40, 50, 60},
        {70, 80, 90},
    };

    int mainDiag = 0;
    int secDiag = 0;

    for (int i = 0; i < matriz.length; i++)

    {
        for (int j = 0; j < matriz.length; j++) {
            if (i == j) mainDiag += matriz[i][j];

            if (i + j == matriz.length - 1) secDiag += matriz[i][j];
        }
    }

    System.out.println("Valor da diagonal principal: " + mainDiag);
    System.out.println("Valor da diagonal secundária: " + secDiag);
}
}
