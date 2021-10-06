package herd;

class Counter { // This class has only package access and  is not visible from Main.
    private static int count;
    static int getNextId(){return ++count;} // The getter.
}

public class GoodSheep {

    private int id;

    public GoodSheep(){
        //Counter.count = 123; // This is illegal, no spoiling is available!
        id = Counter.getNextId();
    }

    @Override
    public String toString(){
        return "There " + (id == 1 ? "is " : "are ") + id + " good sheep.";
    }

}
