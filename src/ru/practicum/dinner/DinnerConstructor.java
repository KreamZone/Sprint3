package ru.practicum.dinner;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DinnerConstructor {
    Map<String, List> allDishes = new HashMap<>();
    Random random = new Random();

     public void newDish(String dishName, String dishType) {
        List <String> dishList = allDishes.getOrDefault(dishType, new ArrayList<>());
        dishList.add(dishName);
        allDishes.put(dishType, dishList);
    }

    public String getRandomDish(String dishType)
    {
        if (!allDishes.containsKey(dishType)) {
            return null;
        }
        List<String> dishList = allDishes.get(dishType);
        return dishList.get(random.nextInt(dishList.size()));
    }
}
