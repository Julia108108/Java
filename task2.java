/* Task_2
Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек, 
если разрешается сделать один разлом по прямой между дольками (то есть разломить шоколадку
на два прямоугольника).
Входные данные
Вводятся 3 числа: n, m и k; k не равно n × m. Гарантируется, что количество долек 
в шоколадке не превосходит 30000.
Выходные данные
Программа должна вывести слово YES, если возможно отломить указанное число долек,
в противном случае вывести слово NO.
Sample Input 1:
3 2 4
Sample Output 1:
YES
*/

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class task2 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.printf("Введите длину одной стороны шоколадки: ");
        int n = sc.nextInt();
        System.out.printf("Введите длину второй стороны шоколадки: ");
        int m = sc.nextInt();
        System.out.printf("Сколько долек мы отломим: ");
        int k = sc.nextInt();
        // k != n * m
        // if (n * m <= 30000) {
        if ((k % m == 0 || k % n == 0) && (k < m * n)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
    }
}

