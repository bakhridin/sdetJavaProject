package day_17;

public class Task2 {
    public static void main(String[] args) {
        String str = "utsuajtdxkgmegdziphdmghhdcbxlzgjtxqmgahmugmvbzwang";

        String toAvoidDuplicate = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (toAvoidDuplicate.contains(String.valueOf(ch))) {
                continue;
            }
            toAvoidDuplicate += ch;
            int counter = 0;

            for (int j = 0; j < str.length(); j++) {

                if (ch == str.charAt(j)) {

                    counter++;
                }

            }
            System.out.println(" " + ch + "=" + counter);

        }
    }
}
