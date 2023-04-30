import java.util.*;

public class hw_seminar3_task2 {
    /*
    Задан целочисленный список ArrayList. Найти минимальное, максимальное и 
    среднее арифметическое из этого списка. Collections.max()
    */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20, 10, 100, 140, 250);  
        Integer max = Collections.max(list);
        System.out.println("Максимальное число: " + max);
        Integer min = Collections.min(list);
        System.out.println("Минимальное число: " + min);
        double avg = getAverage(list);
        System.out.println("Среднее арифмитическое: " + avg );
    }

        private static double getAverage(List<Integer> list) {
        return list.stream()
            .mapToInt(a -> a)
            .average().orElse(0);
    }
}
