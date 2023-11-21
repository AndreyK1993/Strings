package tasks;

import java.util.Locale;
import java.util.Scanner;

public class Main03 {

    private static String[] names = {"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};
    private final Scanner scanner = new Scanner(System.in);

    public void getData() {
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("Enter name: ");
        String nameToSearch = scanner.nextLine().trim();
        findAndCountNames(names, nameToSearch);
    }

    // Метод для пошуку та підрахунку імен у масиві
    private static void findAndCountNames(String[] names, String searchName) {
        int count = 0;

        // Цикл для перебору імен у масиві
        for (String name : names) {
            // Перевірка, чи містить ім'я певну підстроку (пошук ігнорує регістр)
            if (name.toLowerCase().contains(searchName.toLowerCase())) {
                count++;
            }
        }

        // Виведення результатів пошуку
        if (count > 0) {
            System.out.println("Name: " + searchName + ", Count: " + count);
        } else {
            System.out.println("Name not found in the list.");
        }
    }

    // Головний метод для запуску програми
    public static void main(String[] args) {
        new Main03().getData();
    }
}
