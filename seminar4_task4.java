import java.util.*;

public class seminar4_task4 {
    /*Реализовать стэк с помощью массива. 
    Нужно реализовать методы:
    size(), empty(), push(), peek(), pop().
    */
    public static void main(String[] args) {
        ex3();
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
