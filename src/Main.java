import static java.awt.Color.BLACK;
import static java.awt.Color.WHITE;

public class Main {
    public static void main(String[] args) {
        String[] commands = {"sit", "run"};
        Shelter shelter = new Shelter("Peace", "lenina 1");
        Dog dog = new Dog("Rex", "Senbernar", commands,ColorEnum.WHITE, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("гав гав");


        Shelter shelter1 = new Shelter("Nest", "Downhills 7");
        Dog dog1 = new Dog("Bingo", "Eskimo",ColorEnum.BLACK, shelter1);
        System.out.println(dog1.getInfo1());
        dog.makeVoice();
        dog.makeVoice("gavvvvv - gavvvvv");

    }
}