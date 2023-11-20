package tasks;

public class Main02 {

    // Массив строк с набором слов
    private static String[] fruitsAndVegetables = {
            "orange", "plum", "tomato", "onion", "grape", "onion"};

    public static void main(String[] args) {
        String[] correctedData = correctData(provideData());
        // Вызываем метод getOutput с результатом работы метода getData
        getOutput(getData(correctedData));
    }

    private static String[] provideData() {
        return fruitsAndVegetables;
    }

    // Метод для коррекции данных
    private static String[] correctData(String[] items) {
        // удаление 'onion' в каждом элементе массива
        for (int i = 0; i < items.length; i++) {
            items[i] = items[i].replaceAll("onion", "");
        }

        return items;
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
