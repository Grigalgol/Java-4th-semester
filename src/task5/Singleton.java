package task5;

public class Singleton {
    private Singleton instance;
    private Singleton(){}
    public synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
            return instance;
        }
        return instance;
    }
}
