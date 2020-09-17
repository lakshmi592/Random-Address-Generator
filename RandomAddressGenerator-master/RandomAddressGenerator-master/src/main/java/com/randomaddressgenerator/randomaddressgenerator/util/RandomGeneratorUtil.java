package com.randomaddressgenerator.randomaddressgenerator.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGeneratorUtil {

    private static List<String> streetList = new ArrayList<>();
    private static List<String> stateList = new ArrayList<>();
    private static List<String> countryList = new ArrayList<>();

    static {
        streetList.add("Union st. 752");
        streetList.add("Cape Street. 925");
        streetList.add("Mel Town. 252");
        streetList.add("NYC Street. 269");
        streetList.add("State Str. 935");
        streetList.add("Liskov st. 284");
        streetList.add("Laurel Str. 142");
        streetList.add("Francis st. 783");
        streetList.add("Galgot st. 329");
        streetList.add("Lincoln st. 361");
    }

    static {
        stateList.add("New York");
        stateList.add("Chicago");
        stateList.add("San Francisco");
        stateList.add("Dallas");
        stateList.add("California");
    }

    static {
        countryList.add("USA|US");
        countryList.add("Canada|CN");
        countryList.add("Netherlands|NT");
        countryList.add("Mexico|MX");
    }

    public static String getRandomAlphaNumericStringOfGivenLength(int length) {
        String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder builder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index
                    = (int) (alphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            builder.append(alphaNumericString.charAt(index));
        }
        return builder.toString();
    }


    public static String getRandomString() {
        String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder builder = new StringBuilder(4);
        for (int i = 0; i < 4; i++) {
            int index
                    = (int) (alphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            builder.append(alphaNumericString.charAt(index));
        }
        return builder.toString();
    }

    public static String getRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(899);
        return (randomNumber+100)+"";
    }

    public static String getRandomStreet() {
        Random random = new Random();
        return streetList.get(random.nextInt(streetList.size()));
    }

    public static String getPostalCode() {
        return (10000 + new Random().nextInt(90000))+"";
    }

    public static String getState() {
        return stateList.get(new Random().nextInt(stateList.size()));
    }

    public static String getCountry() {
        return countryList.get(new Random().nextInt(countryList.size()));
    }
}
