/** 
* program
*/ 
public class program {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s); // снипет sys
    }
}

public class program {
    public static void main(String[] args) {
        double f = 123.45D;
        System.out.println(f);
    }
}

class Program
{
    public static void main(String[] args) {
        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); // false

    }
}

// вопрос 1. строка 11 - public class program, 
// а строка 18 - class Program. Как правильно?

public class program {
    public static void main(String[] args) {
        boolean f = true && false;
        System.out.printnl(f);
    }
}

public class Program {
    public static void main(String[] args) {
        String msg = " Hello world";

        System.out.printnl(msg);
    }
}

public class program {
    public static void main(String[] args) {
        String s = "qwer";
        s.charAt(1); // w
        System.out.printnl(Integer.MIN_VALUE);
    }
}

public class program {
    public static void main(String[] args) {
        int a = 123;
        
        System.out.printnl(a++); 
    // приоритет постфиксного инкримента ++ ниже, чем вывод
    // ++a приоритет префиксного инкримента выше чем вывод
    }..
}

public class program {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        System.out.printnl(a | b); // | - или
        // 5 в двоичном представлении = 101
        // 2 в двоичн представл =  010
        // 111 ( 1 или 0 - это 1, 0 или 1 - это 1, 1 или 0 - эьо 1)
    }
}

public class program {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        System.out.printnl(a & b); // & - и
        // 5 в двоичном представлении = 101
        // 2 в двоичн представл =  010
        // 000 ( 1 или 0 - это 0, 0 или 1 - это 0, 1 или 0 - эьо 0)
    }
}

public class program {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        System.out.printnl(a ^ b); // ^ - разделительная
        // 5 в двоичном представлении = 101
        // 2 в двоичн представл =  010
        // 111 ( истина = стрго, когда одно из)
    }
}

public class program {
    public static void main(String[] args) {
        String s = "qwwe1"; // 5, 0 ...4
        boolean b = s.length() >= 5 && s.charAt(4) == '1'; // првоеряем длина строки > или = 5, и 4 символ равен 1
        System.out.printnl(b);
    }
}
// операция с двумя имперсандами && не првоерят вторую часть, если первая - ложь
// а операция с одной имперсандой & обязательно проверит два условия

// МАССИВы
public class program {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[3] = 13; // если хотим сделать запись по какому-то значению
        System.out.printnl(arr[3]); // хотим посмотреть 3 эл-т массива
    }
}

public class program {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.printnl(arr.length); // 10

        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.printnl(arr.length); // 5
    }
}