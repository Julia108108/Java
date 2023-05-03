import java.util.HashMap;
import java.util.Map;

public class seminar5_task2 {


static boolean ex1(String s1, String s2){
    /*
    Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
    Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
    повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
    (Например, add - egg изоморфны)
    буква может не меняться, а остаться такой же. (Например, note - code)
    Пример 1:
    Input: s = "foo", t = "bar"
    Output: false
    Пример 2:
    Input: s = "paper", t = "title"
    Output: true
     */
    //paper     title
    //p=t
    //a=i
    //e=l
    //r=e

    //f00     bar
    //f=b
    //o=a
    if (s1.length() != s2.length()){
        return false;
    }
    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();
    Map<Character, Character> map = new HashMap<>();
    for (int i = 0; i < c1.length; i++) {
        if (map.containsKey(c1[i])){
            if (c2[i] != map.get(c1[i])){
                return false;
            }
        } else {
            map.put(c1[i], c2[i]);
        }
    }
    return true;
}
}