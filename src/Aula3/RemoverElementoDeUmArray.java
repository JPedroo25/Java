package Aula3;

public class RemoverElementoDeUmArray {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int current = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 3) {
                current++;
            }
        }

        int[] novoArr = new int[current];

int index = 0;
        for (int i = 0; i < novoArr.length; i++) {
            if(arr[i] != 5){
                novoArr[index] = arr[i];
                index++;
            }
        }

        System.out.println("Array após remoção: ");
        for (int i = 0; i < novoArr.length; i++){
            System.out.println("Elemento na posição " + i + ": " + novoArr[i]);
        }
    }
}