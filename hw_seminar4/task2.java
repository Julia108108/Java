import java.util.LinkedList;
import java.util.Queue;

package hw_seminar4;

public class task2 {
    /*
    Реализуйте очередь с помощью LinkedList со следующими методами:
    enqueue() - помещает элемент в конец очереди, 
    dequeue() - возвращает первый элемент из очереди и удаляет его,
    first() - возвращает первый элемент из очереди, не удаляя.
    */
public static void main(String[] args) {
    LinkedList<Integer> myList = new LinkedList<>();
    for (int i = 0; i < 10; i++) {
        enqueue(myList, getRandomNumber()); //заполняем случайными числами
    }
    System.out.println(myList);
    
    System.out.println(dequeue(myList)); // удалили первый элемент
    System.out.println(myList);
    
    System.out.println(first(myList)); // вывели первый элемент
    System.out.println(myList); 
    }
    
public static void enqueue(LinkedList<Integer> myList, int num) {// помещает элемент в конец очереди
    myList.addLast(num);
}
    
public static int dequeue(LinkedList<Integer> myList) { // возвращает первый элемент из очереди и удаляет его
    int num = myList.get(0);
    myList.remove(0);
    return num;
    }
    
public static int first(LinkedList<Integer> myList) { // возвращает первый элемент из очереди, не удаляя
    int num = myList.get(0);
    return num;
}
   
public static int getRandomNumber() { // генерирует случайное число
    double x = (Math.random() * 99);
    int num = (int) x;
    return num;
    }
}


    
        
        
        /*LinkedList<String> mylist = new LinkedList<>();
        //List mylist = new LinkedList();
        mylist.add("A");
        mylist.add("B");
        mylist.add("C");
        System.out.println(mylist);

        Queue<String> queue = new LinkedList<String>();
        queue.add(S);
        //queue.add(W);
        //queue.add(M);
        System.out.println(queue.peek());

        
    }

    private static LinkedList<String> enqueue(LinkedList<String> list) {
        return numyList;
    }
}
    /*
    private static LinkedList<String> enqueue(LinkedList<String> list) {
        return numyList;
    }

    //private static LinkedList<String> reverseLinkedList(LinkedList<String> list) {
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


    }


}


static void ex4() {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(7);
        stack.push(3);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
    static.void ex3(){...};
    
    Integer[] arr = new Integer[10]; // вместимость задали на 10 эл-ов
    int size = 0; // переменная будет опредл сколько эл-ов в нашем стеке
    
    int size() { // метод возращает значение
        return size;
    }
    boolean empty() { // надо скзать сколько эл-ов в кол-ции
        return size == 0;
    }
    void push(int num) {
        if (size == arr.length) {
            Integer[] arr2 = new Integer[arr.length + 10] // увеличили массив на 10 эл-ов
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2; // переменная будет смотреть на новй массив,в  котором больший объем
        }
        arr[size++] = num; //постикримент(++) будет выполнен после операции присвоения
    }
    int peek() { // метод показывает послдений эл-т
        return arr[size - 1];
    }
    int pop() {
        return arr[--size];
    }



}
