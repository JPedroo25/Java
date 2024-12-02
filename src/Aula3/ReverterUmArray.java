package Aula3;

public class ReverterUmArray {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 91;
        arr[1] = 52;
        arr[2] = 13;
        arr[3] = 264;
        arr[4] = 5;

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Array invertido: ");
        for(int i: arr) {
            System.out.print(i + " ");
        }
    }
}
