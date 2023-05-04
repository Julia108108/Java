package hw_seminar4;

import java.util.LinkedList;
import javax.swing.text.html.HTMLDocument.Iterator;

public class task3 {
    /*
    Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
    Используйте итератор
    */
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator iterator = (Iterator) list.iterator();

        int sum = 0;
        while(iterator.next()){
            sum += iterator.next();
        }

        System.out.println(sum);
    }
}
   