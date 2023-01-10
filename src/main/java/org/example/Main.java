package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);

        int range;
        int bound;
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка \n>> ");
        range = scanner.nextInt();
        System.out.print("Введите вверхнюю границу для значений \n>> ");
        bound = scanner.nextInt();
        logger.log("Создаем и наполняем список");
        List<Integer> input = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < range; i++) {
            input.add(random.nextInt(bound));
        }
        logger.log("Вот созданный список" + input);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра \n>> ");
        Filter filter = new Filter(scanner.nextInt());
        List<Integer> output = filter.filterOut(input);
        logger.log("Выводим результат на экран");
        System.out.println(output);
        logger.log("Завершаем программу");
    }
}