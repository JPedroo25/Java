package Aula3;

public class AdicionarElementoEmArray {
    public static void main(String[] args) {
    int[] arr = new int[5];

    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 4;
    arr[4] = 5;

    int novoElemento = 6;

    int[] novoArr = new int[arr.length + 1];

    for (int i = 0; i < arr.length; i++) {
        novoArr[i] = arr[i];
    }

    novoArr[novoArr.length -1] = novoElemento;

    for (int num : novoArr) {
        System.out.println(num + " ");
    }
}
}