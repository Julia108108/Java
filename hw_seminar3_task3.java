import java.util.ArrayList;
import java.util.HashMap;

public class hw_seminar3_task3 {
    /*
    Заполнить список названиями планет Солнечной системы в произвольном порядке
    с повторениями. Вывести название каждой планеты и количество его повторений в списке.
    */


public static void main(String[] args) {
    ArrayList planets = new ArrayList();
    
    planets.add("Земля");
    planets.add("Марс");
    planets.add("Земля");
    planets.add("Венера");
    planets.add("Юпитер");
    planets.add("Сатурн");
    planets.add("Юпитер");
    planets.add("Юпитер");
    planets.add("Уран");
    planets.add("Марс");
    planets.add("Земля");
    planets.add("Земля");
    planets.add("Меркурий");
    planets.add("Сатурн");
    planets.add("Юпитер");
    planets.add("Юпитер");

    HashMap planetCounts = new HashMap(); // создаем hashmap для подсчета кол-ва повторений

    for (Object planet : planets) {
        if(planetCounts.containsKey(planet)) {
            int count = (int) planetCounts.get(planet);
            planetCounts.put(planet, count + 1);
        }
        // если планета встречается в 1 раз, то добавляем ее в hashmap с кол-ом повторений 1
        else {
            planetCounts.put(planet, 1);
        }
    }
    //вывод названия кажд планеты и кол-во повторений в спсике
    for (Object planet: planetCounts.keySet()) {
        int count = (int) planetCounts.get(planet);
        System.out.println(planet + ": " + count);
    }
}
}

