package task6;

public class Prototype implements Cloneable{
    public static void main(String[] args) {

    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype)super.clone();
    }
}
