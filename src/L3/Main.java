package L3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> wordsArray = new ArrayList<>(15);

        wordsArray.add("слой");
        wordsArray.add("привыкнуть");
        wordsArray.add("жениться");
        wordsArray.add("изготовлять");
        wordsArray.add("артист");
        wordsArray.add("плакать");
        wordsArray.add("прошлый");
        wordsArray.add("банк");
        wordsArray.add("перевод");
        wordsArray.add("учреждение");
        wordsArray.add("перевод");
        wordsArray.add("плакать");
        wordsArray.add("банк");
        wordsArray.add("плакать");
        wordsArray.add("образование");

        checkUnique(wordsArray);

        /*System.out.println("______________");

        Phonebook phonebook = new Phonebook(200);
        phonebook.add("Миронов","7823094610");
        phonebook.add("Морозов","1234567890");
        phonebook.get("Морозов");
        phonebook.get("Егоров");*/
    }

    private static void checkUnique(ArrayList<String> wordsArray) {
        int wordCount = 0;
        StringBuilder uniqueWords = new StringBuilder();

        for (String s : wordsArray) {
            for (String value : wordsArray) {
                if (s.equals(value)) {
                    wordCount++;
                }
            }

            if (wordCount == 1) {
                uniqueWords.append(s).append("; ");
            } else if (wordCount > 1) {
                System.out.println("Слово " + s + " встречалось " + wordCount + " раз(-а).\n");
            }
            wordCount = 0;
        }
        System.out.println("Уникальные слова: " + uniqueWords + "\n");
    }
}
