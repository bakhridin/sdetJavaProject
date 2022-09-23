package day_33;

import java.util.HashMap;

public class JavaMapLoops_01 {
    public static void main(String[] args) {
//
//        HashMap<Integer, String> stCode = new HashMap<>();
//
//        stCode.put(100, "Continue");
//        stCode.put(101, "Switching Protocols");
//        stCode.put(103, "Early Hints");
//        stCode.put(200, "OK");
//        //  stCode.put(202,"");
//
//        System.out.println("stCode = " + stCode);
//
//        HashMap<Integer, String> stCode1 = new HashMap<>();
//        //putAll()-method
//        stCode1.putAll(stCode);
//        System.out.println("stCode1 = " + stCode1);
//
//        //remove()-method
//        stCode1.remove(200);
//        System.out.println("stCode1 = " + stCode1);
//
//
//        //  public Set keySet(): This method is used to return the Set view containing all the keys.
//        int size = stCode.keySet().size();
//        System.out.println(size);
//
//        // public Set entrySet(): This method is used to return the Set view containing all the keys and values.
//        int size1 = stCode.entrySet().size();
//        System.out.println(size1);

        HashMap<Integer, String> errorCodes = new HashMap<>();
        errorCodes.put(200, "OK");
        errorCodes.put(201, "Created");
        errorCodes.put(202, "Accepted");
        errorCodes.put(203, "Non-Authoritative Information");
        errorCodes.put(204, "No Content");

//        for (Integer keys : errorCodes.keySet()) {
////            if (errorCodes.get(keys).equals("Accepted")) {
////                errorCodes.put(keys,"Confirmed");
////            }
////
//            errorCodes.put(keys,errorCodes.get(keys).toUpperCase());
//        }
//
//        System.out.println(errorCodes);

        System.out.println("=============================");

        HashMap<String, Integer> map =  new HashMap<>();
        map.put("a", 10);
        map.put("b", 10);
        map.put("c", 10);
        map.put("d", 10);
        map.put("e", 10);
        map.put("f", 10);
        map.put("g", 10);

        for (String s : map.keySet()) {
            if (s.equals("a")) {
                map.put(s,map.get(s)+10);
            }else  if (s.equals("b")) {
                map.put(s,map.get(s)+20);
            }else  if (s.equals("c")) {
                map.put(s,map.get(s)+30);
            }else  if (s.equals("d")) {
                map.put(s,map.get(s)+40);
            }else  if (s.equals("e")) {
                map.put(s,map.get(s)+50);
            }else  if (s.equals("f")) {
                map.put(s,map.get(s)+60);
            }else  if (s.equals("g")) {
                map.put(s,map.get(s)+70);
            }
        }
        System.out.println("map = " + map);



    }
}
