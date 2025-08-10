package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DinnerConstructor {
    HashMap <String, ArrayList<String>> allDishes;
    Random random;

    DinnerConstructor() {
        allDishes = new HashMap<>();
        random = new Random();
    }

    void newDish(String dishName, String dishType) {
        ArrayList <String> dishList = allDishes.getOrDefault(dishType, new ArrayList<>());
        dishList.add(dishName);
        allDishes.put(dishType, dishList);
    }

    String getRandomDish(String dishType)
    {
        if (!allDishes.containsKey(dishType)) {
            System.out.println("Такой категории нет!");
            return null;
        }
        ArrayList<String> dishList = allDishes.get(dishType);
        return dishList.get(random.nextInt(dishList.size()));
    }
}
