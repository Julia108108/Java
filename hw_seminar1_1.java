//Вычислить n-ое треугольного число (сумма чисел от 1 до n)

import java.util.Scanner;

public class hw_seminar1_1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //System.out.println(" 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n)");
            System.out.println("Введите число: ");
            int num = sc.nextInt();
            int result_sum = num * (num + 1) / 2;
            System.out.println("Сумма чисел от 1 до n равна: " + result_sum);
            }
}