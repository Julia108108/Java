import java.util.LinkedList;

//package hw_seminar4;

public class task1 {
    /*
    Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет
    “перевернутый” список. Постараться не обращаться к листу по индексам.
     */

    public static void main(String[] args) {
        // создаем список
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

        // вызываем метод, возвращающий перевернутый список
        LinkedList<String> reversedList = reverseLinkedList(list);
        // выводим перевернутый список
        System.out.println("Перевернутый список: " + reversedList);
    }

    private static LinkedList<String> reverseLinkedList(LinkedList<String> list) {
        // создаем новый LinkedList для хранения перевернутого списка 
        LinkedList<String> reversedList = new LinkedList<>();
        // проходим по эл-ам исходного списка в обратном порядке
        // и добавл их в новый список
        for (int i = list.size() - 1; i >= 0; i--) {
            String element = list.get(i);
            reversedList.add(element);
        }
        return reversedList;
    }
}

