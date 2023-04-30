import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Random;

public class hw_seminar3_task1 {
    /*
    Пусть дан произвольный список целых чисел, удалить из него
    четные числа
     */
    public static void main(String[] args) {
        List numbers = new ArrayList();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }

        Iterator iterator = numbers.iterator();

        while (iterator.hasNext()) {
            int number = (int) iterator.next();
                if (number % 2 == 0) {
                    iterator.remove();
                }
        }

        System.out.println(numbers);
    }
}
