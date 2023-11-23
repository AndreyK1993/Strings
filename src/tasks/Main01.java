package tasks;

public class Main01 {

    // Массив строк с набором слов
    private static String[] fruitsAndVegetables = {"brange", "plum", "tomato", "onibn", "grape"};

    public static void main(String[] args) {
        String[] correctedData = correctData(provideData());
        // Вызываем метод getOutput с результатом работы метода getData
        getOutput(getData(correctedData));
    }

    //избыточный метод, возвращающий массив
    private static String[] provideData() {
        return fruitsAndVegetables;
    }

    // Метод для коррекции данных
    private static String[] correctData(String[] items) {
        // Замена символа 'b' на 'o' в каждом элементе массива
        for (int i = 0; i < items.length; i++) {
            items[i] = items[i].replace("b", "o");
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
            // Использование append()
            stringBuilder
                    .append(count)
                    .append(") ")
                    .append(name)
                    .append("\n");
        }

        // Возвращаем строку вывода
        return stringBuilder.toString();
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
