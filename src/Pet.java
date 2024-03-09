import java.awt.*;
import java.util.Random;

public class Pet {
    private int age;
    private ColorEnum  colorEnum;
    private Shelter shelter;

    public void setAge(int age) {
        this.age = age;
    }

    public void setColorEnum(ColorEnum colorEnum) {
        this.colorEnum = colorEnum;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public int getAge() {
        return age;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }

    public Shelter getShelter() {
        return shelter;
    }

 private int generateDefaultAge(){
    Random random =new Random();
    return random.nextInt(15)+1;
}
public String getInfo() {
         return "Age:" + age +
            "\nColor" + colorEnum +
            "\nShelter address:" + shelter.getAddress() +
            "\nShelter name:" + shelter.getName();



}
}