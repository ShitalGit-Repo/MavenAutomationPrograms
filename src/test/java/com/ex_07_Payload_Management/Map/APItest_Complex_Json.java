package com.ex_07_Payload_Management.Map;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class APItest_Complex_Json {

    public static void main(String[] args) {

        Map<String, Object> payload = new LinkedHashMap<>();
        List<LinkedHashMap<String, Object>> fruits = new ArrayList<>();

        LinkedHashMap<String, Object> apple = new LinkedHashMap<>();
        apple.put("name", "Apple");
        apple.put("color", "#FF0000");

        LinkedHashMap<String, Object> appleDetails = new LinkedHashMap<>();
        appleDetails.put("type", "Pome");
        appleDetails.put("season", "Fall");
        apple.put("details", appleDetails);

        LinkedHashMap<String, Object> appleNutrients = new LinkedHashMap<>();
        appleNutrients.put("calories", 52);
        appleNutrients.put("fibre", "2.4gm");
        appleNutrients.put("vitaminC", "4.6gm");
        apple.put("nutrients", appleNutrients);

        fruits.add(apple);

        LinkedHashMap<String, Object> banana = new LinkedHashMap<>();
        LinkedHashMap<String, Object> bananaDetails = new LinkedHashMap<>();
        LinkedHashMap<String, Object> bananaNutrients = new LinkedHashMap<>();

        LinkedHashMap<String, Object> orange = new LinkedHashMap<>();
        LinkedHashMap<String, Object> orangeDetails = new LinkedHashMap<>();
        LinkedHashMap<String, Object> orangeNutrients = new LinkedHashMap<>();

    }

}
