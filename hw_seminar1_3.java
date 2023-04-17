//  Вычислить n!(произведение чисел от 1 до n)

import java.util.Scanner;
public class hw_seminar1_3 {
    public long factorialUsingForLoop(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * 1;
        }
        return fact;
        //System.out.println("Произведение чисел от 1 до n: " + fact);
    }

}