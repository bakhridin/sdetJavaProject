package day_17;

public class Task6 {
    public static void main(String[] args) {
        String str = "xyz";
        String str2="utsuajtdxkgmexyzgdxyzziphdmghhdcbxlzgjtxyyyyqmgahmugmvbzwang";


        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            int count=0;
            for (int j = 0; j < str2.length(); j++) {
                if (ch==str2.charAt(j)) {
                    count++;
                }

            }
            System.out.println(""+str.charAt(i)+"="+count+" ");

        }
    }
}
