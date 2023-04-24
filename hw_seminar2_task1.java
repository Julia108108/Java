
public class hw_seminar2_task1 {

/* Посчитайте сколько драгоценных камней в куче обычных камней
Пример:
jewels = “aB”, stones = “aaaAbbbB”
Результат в консоль ”a3B1”
*/
 
public static void main(String[] args) {
    String jewels = "aB";
    String stones = "aaaAbbbB";
    System.out.println(findJewelsInStones(jewels, stones));
}
public static String findJewelsInStones(String jewels, String stones) {
    StringBuilder builder = new StringBuilder();
    char [] jewel = jewels.toCharArray();
    char [] st = stones.toCharArray();
        for (char i: jewel){
            int count = 0;
            for (char j: st){
                if (i ==j) count++;
            }
            builder.append(i);
            builder.append(count);
        }
        return builder.toString();
    }
}
