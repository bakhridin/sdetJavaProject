package day_57.Interfaces.Examp2;

public class APP {
    public static void main(String[] args) {
        ByTwoo bt=new ByTwoo();

        for (int i = 0; i < 5; i++) {
            bt.getNext();
            System.out.println(bt.val);
        }
    }
}
