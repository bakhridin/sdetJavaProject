package day_55;

import java.util.ArrayList;

public class Library{
    static final ArrayList<Book>listOfBook=new ArrayList<>();

    static {
        Book b =new Book("King of Jungle","Ernest Hemenguay","1976");
        Book b1 =new Book("Empire","Alex Duma","1950");
        Book b2 =new Book("Zoo","NAT GEO","1912");
        listOfBook.add(b);
        listOfBook.add(b1);
        listOfBook.add(b2);

    }

    public static ArrayList<String> oldestBook(ArrayList<String>list) {

        ArrayList<String>list1=new ArrayList<>();
        for (String s : list) {
            if(s.contains("1912")){
                list1=list;
            }
        }


        return list1;
    }

    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();


        oldestBook(list);
    }
}
