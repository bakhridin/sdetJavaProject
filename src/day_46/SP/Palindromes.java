package day_46.SP;



public class Palindromes {
    public static void main(String[] args) {
 String str="Madam";
        Boolean palindrome2 = isPalindrome2(str);
        System.out.println(palindrome2);

        Boolean palindrome3 = isPalindrome3(str);
        System.out.println(palindrome3);

        int x=12321;
        Boolean palindrome4 = isPalindrome4(x);
        System.out.println(palindrome4);
    }

    static   Boolean isPalindrome2(String str1){
        String newStr = "";
        for (int i = str1.length()-1; i >=0 ; i--) {
            newStr +=str1.charAt(i);
        }
        if(str1.equals(newStr)){
            return true;
        }
        return false;
    }

    static Boolean isPalindrome3(String str){

        int start = 0;
        int end = str.length()-1;

        while (start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static Boolean isPalindrome4(int x){ // way 4 for integers

        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        int r = 0;
        while (x > r){
            r = r * 10 + x % 10;
            x = x / 10;
        }
        return r == x || r / 10 == x;
    }
}
