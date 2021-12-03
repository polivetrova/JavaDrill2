package L3;

import java.util.*;

public class ListTest {
    // в домашке не нужен был метод принтфонбук,
    // поэтому в классе фонбук его нет
    // а тут есть
    // бог знает зачем

    private String phoneNum;
    private String surname;

    HashMap<String, String> phoneBook;

    public ListTest(int capacity) {
        this.phoneBook = new HashMap<>(capacity);

        phoneBook.put("Петров", "3458038334");
        phoneBook.put("Васечкин", "5634891029");
        phoneBook.put("Антонов", "6754902310");
        phoneBook.put("Морозов", "9065821520");
    }

    public void add(String surname, String phoneNum){
        //

        if(phoneBook.containsKey(surname)){
            phoneNum = phoneBook.get(surname) + "; " + phoneNum;
            phoneBook.put(surname, phoneNum);

        } else {
            phoneBook.put(surname, phoneNum);
        }
    }

    public void get(String surname){
        if(phoneBook.containsKey(surname)){
            System.out.println("Номер телефона: " + phoneBook.get(surname));
        } else {
            System.out.println("Такого человека нет в справочнике");
        }
    }

    public void printPhoneBook(){
        TreeMap<String, String> sorted = new TreeMap<>(phoneBook);
        for (Map.Entry<String, String> pb : sorted.entrySet()) {
            System.out.println("Фамилия: " + pb.getKey() + "; номер телефона: " + pb.getValue());
        }
    }
}
