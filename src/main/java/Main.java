import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        firstTask();
        twoTask();
    }

    public static void firstTask() {
        ArrayList<String> arrayListString = new ArrayList<>();

        String[] arrayString = {"солнце", "вьюга", "зима", "метель", "солнце", "город",
                "зима", "зима","солнце", "вьюга", "зима", "метель", "солнце", "город",
                "зима", "зима","солнце", "вьюга", "зима", "метель", "солнце", "город",
                "зима", "зима", "зима", "метель", "солнце", "город", "машина", "зверь", "метро",
                "индивид", "машина", "соревнование"};

        Collections.addAll(arrayListString, arrayString);

        System.out.println("Массив слов: \n" + arrayListString.toString() + "\n");

        countingUniqueWords(arrayListString);

    }

    private static void twoTask() {

        Phonebook phonebook = new Phonebook();

        phonebook.addAbonent("Иванов", "+7 962 804 76 66");
        phonebook.addAbonent("Петров", "+7 994 342 22 11");
        phonebook.addAbonent("Сидоров", "+7 960 996 02 06");
        phonebook.addAbonent("Пуговкин", "+7 999 501 18 18");
        phonebook.addAbonent("Степанов", "+7 990 123 35 35");
        phonebook.addAbonent("Петров", "+7 994 143 22 55");
        phonebook.addAbonent("Сидоров", "+7 932 996 01 33");
        phonebook.addAbonent("Пуговкин", "+7 967 501 23 18");
        phonebook.addAbonent("Иванов", "+7 991 801 01 64");
        phonebook.addAbonent("Иванов", "+7 995 801 01 44");

        phonebook.getMapPhonebook();

        phonebook.getPhoneAbonent("Иванов");
        phonebook.getPhoneAbonent("Сидоров");
        phonebook.getPhoneAbonent("Петренко");

    }

    private static void countingUniqueWords(ArrayList<String> arrayListString) {
        Set<String> stringSet = new HashSet<String>(arrayListString);
        Set<String> uniqueSet = new HashSet<String>();
        Map<String, Integer> map = new TreeMap<>();
        Iterator<String> iterSet = stringSet.iterator();
        while (iterSet.hasNext()) {
            String strSet = iterSet.next();
            int count = 1;
            Iterator<String> iterArrayListString = arrayListString.iterator();
            while (iterArrayListString.hasNext()) {
                String strArray = iterArrayListString.next();
                if (strArray == strSet) {
                    map.put(strSet, count++);
                }
            }
            if (count == 2) {
                uniqueSet.add(strSet);
            }
        }
        System.out.println("Список уникальных слов: \n" + uniqueSet + "\n");
        System.out.println("Количество повторений слов: \n" + map);
        System.out.println();
    }

}

