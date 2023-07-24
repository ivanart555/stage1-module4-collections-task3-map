package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> result = new HashMap<>();

        StringTokenizer stringTokenizer = new StringTokenizer(sentence, " ,.!?");
        while (stringTokenizer.hasMoreTokens()) {
            String str = stringTokenizer.nextToken().toLowerCase(Locale.ROOT);
            if (result.containsKey(str)) {
                Integer number = result.get(str) + 1;
                result.put(str, number);
            } else {
                result.put(str, 1);
            }
        }

        return result;
    }
}
