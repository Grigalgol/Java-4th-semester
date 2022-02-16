package task5;

public class Singleton2 {
    private Singleton2(){}

    private static class SingletonHolder {
        private final static Singleton2 instanse = new Singleton2();
    }

    public Singleton2 getInstance() {
        return SingletonHolder.instanse;
    }
}
