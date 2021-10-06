import herd.BadSheep;
import herd.GoodSheep;

public class Main {

    public static void main(String[] args) {

        System.out.println("The example of bad sheep counter:");
        for(int i = 0; i < 10; i++){

            System.out.println(new BadSheep());
        }

        System.out.println("The example of good sheep counter:");
        for(int i = 0; i < 10; i++) System.out.println(new GoodSheep());
    }
}
