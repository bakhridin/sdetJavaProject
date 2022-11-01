package SaturdayProject_10_01_2022;

public class Task3 {
    public static void main(String[] args) {
        String str = "aaaabbacccccdddccaaadddaac";
        char maxRep = maxRepeating(str);
        System.out.println(maxRep);

//        char c = mostRepeatedChar(str);
//        System.out.println("c = " + c);
//        char d = mostRepeatedChar(str);
//        System.out.println(d);

    }
//
//    public static char mostRepeatedChar(String str) {
//        char ch = 0;
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = 1; j < str.length(); j++) {
//                if(str.charAt(i)==str.charAt(j) && i!=j){
//                    ch=str.charAt(i);
//                }
//            }
//
//        }
//
//        return ch;
//
//    }

    // function to find out the maximum repeating
    // character in given string
    static char maxRepeating(String str) {
       // int len = str.length();
        int count = 0;

        // Find the maximum repeating character
        // starting from str[i]
        char res = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            int cur_count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j))
                    break;
                cur_count++;
            }

            // Update result if required
            if (cur_count > count) {
                count = cur_count;
                res = str.charAt(i);
            }
        }
        return res;
    }

}
