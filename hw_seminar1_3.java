//  Вычислить n!(произведение чисел от 1 до n)

import java.util.Scanner;

public class hw_seminar1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) result *= i;
        System.out.println("n! равен " + result);
    }
}
       
