import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Phonebook {

    private Map<String, ArrayList<String>> mapPhonebook = new TreeMap<>();

    public void addAbonent(String name, String phone) {
        if (mapPhonebook.containsKey(name.toUpperCase())){
            mapPhonebook.get(name.toUpperCase()).add(phone);
        } else {
            ArrayList<String> arrayPhone = new ArrayList<>();
            arrayPhone.add(phone);
            mapPhonebook.put(name.toUpperCase(), arrayPhone);
        }
    }

    public void getPhoneAbonent(String name){
        if (!mapPhonebook.containsKey(name.toUpperCase())) {
            System.out.printf("\nВ телефонной книге отсутствует контакт с именем '%s'", name);
        } else {
            System.out.printf("\nПоиск по фамилии: %10s Номер телефона: %s",name.toUpperCase(),
                    mapPhonebook.get(name.toUpperCase()));
        }

    }

    public void getMapPhonebook(){
        System.out.println("Телефонная книга: ");
        for (Map.Entry<String, ArrayList<String>> mapElement : mapPhonebook.entrySet()) {
            System.out.printf("Контакт: %10s Номер телефона: %s\n", mapElement.getKey(), mapElement.getValue());

        }


        }
    }

