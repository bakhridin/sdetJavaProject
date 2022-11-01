package day_57.Interfaces.Examp2;

public class ByTwoo implements Series{
    int val;

    public ByTwoo() {
        this.val = 0;
    }

    @Override
    public void getNext() {
        val+=2;
    }
}
