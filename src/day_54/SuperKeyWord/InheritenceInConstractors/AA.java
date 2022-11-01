package day_54.SuperKeyWord.InheritenceInConstractors;

public class AA {
    String name = "AA";

    public AA(String str) {
        this.name = name;
    }
}

class BB extends AA{
    public BB(String str) {
        super(str);
        System.out.println(this.name);
    }
}
