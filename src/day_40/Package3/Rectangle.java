package day_40.Package3;

public class Rectangle {
    private  int length;
    private  int width;
    int area;
    int perimeter;

    private void setPerimeter() {
        this.perimeter=2*(this.length+this.width);
    }

    private void setArea() {
        this.area=this.length*this.width;
    }

    public Rectangle(int length, int width) {
        this.length =length ;
        this.width = width;
        this.setPerimeter();
        this.setArea();
    }

    public String toString() {
        return "Rectangle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
