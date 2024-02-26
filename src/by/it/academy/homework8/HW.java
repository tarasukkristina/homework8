package by.it.academy.homework8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HW {
    public static void main(String[] args) {
        String str = "baaccc";
        String[] strArray = str.split("");
        System.out.println(Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i<strArray.length; i++) {
            String letter = strArray[i];
            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter) + 1);
            }
            else {
                map.put(letter, 1);
            }
        }
        System.out.println(map);
    }
}


