import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class seminar4_task1 {
    

    public static void main(String[] args) {
        
        /*
        1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
        2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
        */
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        long timeSatrt = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list2.add(i);
        }
        long timeFinish = System.currentTimeMillis();
        long timeStart = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
    }
}
