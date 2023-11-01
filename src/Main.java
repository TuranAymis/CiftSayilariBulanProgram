import java.util.Scanner;

public class Main {
    //Java ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan program.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        int i = 0;
        int result;

        for (i = 0; i <= number; i++){
            result = i % 2;

            if (result == 0){
                System.out.println(i);
            }
        }
    }
}