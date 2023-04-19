/* Реализовать простой калькулятор
Минимум -- > Условия + Цикл
Введите число
Введите число
Выберите операцию
1 - сложить
2 - умножить
*/

import java.util.Scanner;

public class hw_seminar1_4 {
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;
      Scanner reader = new Scanner(System.in);
      System.out.print("Введите первое число: ");
      num1 = reader.nextDouble();
      System.out.print("Введите второе число: ");
      num2 = reader.nextDouble();
      System.out.print("\nВведите оператор (+, -, *, /): ");
      op = reader.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
         default:  System.out.printf("Ошибка! Введите корректные логический оператор");
            return;
      }
      System.out.print("\nРезультат операции:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
}

