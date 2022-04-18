package task7;

public class FacadeExample {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.sayHello("Grisha");
    }
}

class Facade {
    String str = "Hello";
    public void sayHello (String name) {
        System.out.println(str + " " + name);
    }
}