package day_39.ClassVoidMethodsExamples.Task1;

public class Animal {
    String name;
    int kmHSpeed;
    int mileHSpeed;
    char shortName;


    public void setValues(String name,int mileHSpeed) {
        //should be CamelCase
        this.name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
        this.mileHSpeed=mileHSpeed;
    }

    public void setShortName() {
        this.shortName=this.name.charAt(0);
    }

    public void setKmHSpeed() {
        this.kmHSpeed=(int)(mileHSpeed*1.61);

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", kmHSpeed=" + kmHSpeed +
                ", mileHSpeed=" + mileHSpeed +
                ", shortName=" + shortName +
                '}';
    }
}
