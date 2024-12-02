package Aula2;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 9;
        arr[2] = 17;
        arr[3] = 3;
        arr[4] = 4;

        int numCurrent;
        int maiorValor = arr[0];

        for(int i = 0; i < arr.length; i++){
            numCurrent = arr[i];

            if(numCurrent > maiorValor){
                maiorValor = numCurrent;
            }
        }

        System.out.println(maiorValor);
    }
}
