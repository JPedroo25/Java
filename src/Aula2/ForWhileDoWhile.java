package Aula2;

public class ForWhileDoWhile {
    public static void main(String[] args) {

    for (int i = 0; i <= 10; i++){
        System.out.println(i);
    }
        System.out.println("Terminou");
        System.out.println("");

    int count = 0;
    while(count <= 10){
        System.out.println(count);
        count++;
    }
        System.out.println("Terminou");
        System.out.println("");

        int count2 = 0;
    do{
        System.out.println(count2);
        count2++;
    } while(count2 <= 10);
        System.out.println("Terminou");
}
}