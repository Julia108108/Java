import java.util.HashMap;
import java.util.Map;

public class seminar5_task1 {
    /*
    Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
    123456 Иванов
    321456 Васильев
    234561 Петрова
    234432 Иванов
    654321 Петрова
    345678 Иванов
    Вывести данные по сотрудникам с фамилией Иванов.
     */



}

public class Passports {
    private Map<String, String> map = new HashMap<>();

    void add(String passportNum, String lastName) {
        map.put(passportNum, lastName);
    }

    String get(String passportNum) {
        return passportNum + " " + map.get(passportNum);
    }

    String getByLastName(String lastName) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry: map.entrySet()) {
            
        }
    }
    String getAll() { //получитьв есь список
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry: map.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder;
    }
}