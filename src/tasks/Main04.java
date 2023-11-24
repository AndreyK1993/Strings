package tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Main04 {
    public static void main(String[] args) {
        new Main04().getData();
    }

    private static String[] textArray = {
            "Lorem ipsum dolor sit amet,",
            "consectetur adipiscing elit.",
            "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris",
            "nisi ut aliquip ex ea commodo consequat.",
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum",
            "dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non",
            "proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    };
    private final Scanner scanner = new Scanner(System.in);

    public void getData() {
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("Enter text: ");
        String inputText = scanner.nextLine().trim();

        if (inputText.isEmpty()) {
            System.out.println("Entered text is empty.");
        } else {
            processInputText(inputText);
        }
    }


    /* String[] words = inputText.split("[\\s,.;]+");: Эта строка кода разделяет введенный текст (inputText) на слова. Мы используем метод split класса String, передавая ему регулярное выражение [\\s,.;]+. Это регулярное выражение означает "любое количество (+) пробельных символов (\\s), запятых, точек с запятой или точек". Таким образом, текст разделяется на слова в зависимости от пробелов и указанных знаков препинания.

Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));: Здесь создается Set (множество) с именем uniqueWords, который будет содержать только уникальные слова из массива words. Arrays.asList(words) преобразует массив words в список, а затем HashSet удаляет все дубликаты, оставляя только уникальные слова.

System.out.println("Number of unique words: " + uniqueWords.size());: Выводится количество уникальных слов в тексте. Метод size() возвращает количество элементов в множестве.

System.out.println("Unique words: " + uniqueWords);: Выводятся сами уникальные слова. Множество автоматически удаляет дубликаты, поэтому оно содержит только уникальные элементы.

Таким образом, этот блок кода разбивает введенный текст на слова, убирает повторяющиеся слова и выводит информацию о количестве уникальных слов и самих уникальных словах.*/

    private void processInputText(String inputText) {
        String[] words = inputText.split("[\\s,.;]+");
        // Разделение текста на слова


        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        // Используем Set для подсчета уникальных слов

        System.out.println("Number of unique words: " + uniqueWords.size());
        System.out.println("Unique words: " + uniqueWords);
    }
}
