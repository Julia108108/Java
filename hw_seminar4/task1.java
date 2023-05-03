import java.util.LinkedList;

package hw_seminar4;

public class task1 {
    /*
    Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет
    “перевернутый” список. Постараться не обращаться к листу по индексам.
     */

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Ч");
        list.add("Е");
        list.add("Л");
        list.add("О");
        list.add("В");
        list.add("Е");
        list.add("К");
        list.add("-");
        list.add("П");
        list.add("А");
        list.add("У");
        list.add("К");

        System.out.println("Это первоначальный список: " + list);

        LinkedList<String> reversedList = reverseLinkedList(list);
        System.out.println("Перевернутый список: " + reversedList);

    }

    private static LinkedList<String> reverseLinkedList(LinkedList<String> list) {
        //return null;
        LinkedList<String> reversedList = new LinkedList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            String element = list.get(i);
            reversedList.add(element);
        }
        return reversedList;
    }
}

