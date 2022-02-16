package task6;

public class AbstractFactory {
    public static void main(String[] args) {
        AnimalFactory homeFactory = new AbstractAnimalFactory().createAnimalFactory("home");
        AnimalFactory wildFactory = new AbstractAnimalFactory().createAnimalFactory("wild");
        HomeAnimal cat = homeFactory.createHomeAnimal("cat");
        HomeAnimal dog = homeFactory.createHomeAnimal("dog");

        WildAnimal wolf = wildFactory.createWildAnimal("wolf");
        WildAnimal fox = wildFactory.createWildAnimal("fox");

        cat.say();
        dog.say();

        wolf.say();
        fox.say();
    }
}

interface HomeAnimal {
    void say();
}

class MyCat implements HomeAnimal {

    @Override
    public void say() {
        System.out.println("Мяу");
    }
}

class MyDog implements HomeAnimal {

    @Override
    public void say() {
        System.out.println("Гав");
    }
}

class FactoryHomeAnimal implements AnimalFactory{
    public HomeAnimal createHomeAnimal(String type) {
        switch (type) {
            case "cat":
                return new MyCat();
            case "dog":
                return new MyDog();
            default:
                return null;
        }
    }

    @Override
    public WildAnimal createWildAnimal(String type) {
        return null;
    }
}

interface WildAnimal {
    void say();
}

class Wolf implements WildAnimal {

    @Override
    public void say() {
        System.out.println("Вуф");
    }
}

class Fox implements WildAnimal {

    @Override
    public void say() {
        System.out.println("Пип");
    }
}

class FactoryWildAnimal implements AnimalFactory{
    @Override
    public HomeAnimal createHomeAnimal(String type) {
        return null;
    }

    public WildAnimal createWildAnimal(String type) {
        switch (type) {
            case "wolf":
                return new Wolf();
            case "fox":
                return new Fox();
            default:
                return null;
        }
    }
}

interface AnimalFactory {
    HomeAnimal createHomeAnimal(String type);
    WildAnimal createWildAnimal(String type);
}

class AbstractAnimalFactory {
    AnimalFactory createAnimalFactory(String typeOfFactory) {
        switch(typeOfFactory) {
            case "wild" : return new FactoryWildAnimal();
            case "home" : return new FactoryHomeAnimal();
            default: return null;
        }
    }
}