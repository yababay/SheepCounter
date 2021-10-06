package herd;

public class BadSheep {
    private int id;
    private static int count; // Every sheep can spoil this counter.

    public BadSheep(){
        id = ++count;
        if(count == 5) count += 550; // The 9-th sheep spoils the counter!
    }

    @Override
    public String toString(){
        return "There " + (id == 1 ? "is " : "are ") + id + " bad sheep.";
    }
}
