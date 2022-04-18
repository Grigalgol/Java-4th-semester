package task6;

public class Factory {
    public static void main(String[] args) {
        Animal cat = FactoryAnimal.create("cat");
        Animal dog = FactoryAnimal.create("dog");
        cat.say();
        dog.say();
    }
}

interface Animal {
    void say();
}

class Cat implements Animal {

    @Override
    public void say() {
        System.out.println("Мяу");
    }
}

class Dog implements Animal {

    @Override
    public void say() {
        System.out.println("Гав");
    }
}

class FactoryAnimal {
    public static Animal create(String type) {
        switch (type) {
            case "cat":
                return new Cat();
            case "dog":
                return new Dog();
            default:
                return null;
        }
    }
}
