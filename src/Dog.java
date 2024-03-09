import java.awt.*;
import java.util.Arrays;

public class Dog extends Pet{
    private String name;
    private String breed;
    private String [] commands;

    public Dog(String name, String breed, String[] commands, ColorEnum colorEnum, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColorEnum(colorEnum);
        super.setShelter(shelter);
    }

    public Dog(String name, String breed, ColorEnum colorEnum, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setColorEnum(colorEnum);
        super.setShelter(shelter);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String[] getCommands() {
        return commands;
    }
    public void makeVoice(){
        System.out.println("Собака издает звук");

    }
    public void makeVoice( String voice){
        System.out.println("Собака издает звук:" + voice);
    }
    public String getInfo(){
        return super.getInfo()+
         "\n name:" + name +
                "\n breed:" + breed +
                "\n commands:" + Arrays.toString(commands);


        }

        public String getInfo1(){
        return super.getInfo() +
                "\n name:" + name +
                "\n breed:" + breed;
        }

}
