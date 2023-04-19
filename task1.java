/* Task_1
Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров, 
а за ночь спускаясь на b метров. На какой день улитка доползёт до вершины шеста?
Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.
Программа должна вывести одно натуральное число.
Sample Input 1:
10
3
2
Sample Output 1:
8
*/

import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Высота шеста: ");
        int h = sc.nextInt();
        System.out.printf("Проползает вверх: ");
        int a = sc.nextInt();
        System.out.printf("Проползает вниз: ");
        int b = sc.nextInt();
        // a > b
        int result = 0;
            int days = 0;
            while(result < (h - a)) {
                result += a - b;
                days++;
            }
        days++;
        System.out.println(days);
        
    }
}
        
       