package day_35;

import java.util.HashMap;
import java.util.Map;

public class Task1 {


    static HashMap <String, Integer> wordLen(String [] nums){
        HashMap <String, Integer> map = new HashMap<>();
        for (String num : nums) {
            map.computeIfAbsent(num, k -> 0);
            map.computeIfPresent(num, (k, v) -> v+1);
        }
        return map;
    }

    public static void main(String[] args) {

//       String[]num={"a", "bb", "a", "bb"};
//       String[]num1={"this", "and", "that", "and"};
//       String[]num2={"code", "code", "code", "bug"};
//        HashMap<String, Integer> stringIntegerHashMap = wordLen(num1);
//        System.out.println("stringIntegerHashMap = " + stringIntegerHashMap);

        String[]firstChars={"salt", "tea", "soda", "toast"};
        Map<String, String> stringStringMap = firstChar(firstChars);
        System.out.println("stringStringMap = " + stringStringMap);


    }

    public static  Map<String, String> firstChar(String[] strings) {
        Map<String,String>map=new HashMap<>();
        for (String string : strings) {
            if (string.startsWith("s")) {
                map.put(string, (string.concat(string)));
            }
        }

        return map;

    }


}
