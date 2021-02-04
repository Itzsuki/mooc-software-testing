package tudelft.roman;

import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    private static Map<Character, Integer> map;

    static {
        map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int convert(String s) {

        int convertedNumber = 0;
        int valid = 1;
        for(int i = 0; i < s.length(); i++) {
            int currentNumber = map.get(s.charAt(i));
            int next = i+1 < s.length() ? map.get(s.charAt(i+1)) : 0;
            int next2 = i+2 < s.length() ? map.get(s.charAt(i+2)) : 0;

            if (valid == 1)
                if (currentNumber * 2 != next) //noValidEntry2
                    if(currentNumber >= next)
                        convertedNumber += currentNumber;
                    else
                        if (currentNumber < 10) //noValidEntry
                            convertedNumber -= currentNumber;
                        else
                            if (next2 !=0 && currentNumber * next != next2)
                                convertedNumber -= currentNumber;
                            else
                                valid = 0;
                else
                    valid = 0;
            else
                convertedNumber = 0;
        }

        return convertedNumber;

    }
}
