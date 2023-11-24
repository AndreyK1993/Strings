package tasks;

import java.util.List;
import java.util.ArrayList;

public class Main02 {

    public static void main(String[] args) {
        String[] correctedData = correctData(provideData());
        // Вызываем метод getOutput с результатом работы метода getData
        getOutput(getData(correctedData));
    }

    // Массив строк с набором слов
    private static String[] fruitsAndVegetables = {
            "orange", "plum", "tomato", "onion", "grape", "onion"};

    private static String[] provideData() {
        return fruitsAndVegetables;
    }

    // Метод для коррекции данных
    private static String[] correctData(String[] items) {
        List<String> correctedList = new ArrayList<>();

        for (String item : items) {
            // удаление 'onion' в каждом элементе массива
            String correctedItem = item.replaceAll("onion", "").trim();

            // Проверяем, не является ли строка пустой, перед добавлением
            if (!correctedItem.isEmpty()) {
                correctedList.add(correctedItem);
            }
        }

        // Преобразуем список обратно в массив
        return correctedList.toArray(new String[0]);
    }


    // Метод для форматированного вывода данных
    private static String getData(String[] items) {
        // Создаем объект StringBuilder для построения строки вывода
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;

        // Используем цикл для добавления каждого элемента в строку вывода
        for (String name : items) {
            count++;
            // Проверяем, не является ли строка пустой, перед добавлением
            if (!name.trim().isEmpty()) {
                // Использование append()
                stringBuilder
                        .append(count)
                        .append(") ")
                        .append(name)
                        .append("\n");
            }
        }

        // Возвращаем строку вывода
        return stringBuilder.toString();
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
