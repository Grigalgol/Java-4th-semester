package task6;

public class Builder {

    public static void main(String[] args) {
        SportCar audi = new SportCar.BuilderCar("audi").setColor("red").setMaxSpeed(400).build();
        System.out.println(audi.getName());
        System.out.println(audi.getColor());
        System.out.println(audi.getMaxSpeed());
    }
}

class SportCar {
    private String name;
    private String color = "black";
    private int maxSpeed = 200;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private SportCar(BuilderCar builderCar) {
        this.maxSpeed = builderCar.maxSpeed;
        this.name = builderCar.name;
        this.color = builderCar.color;
    }

    static class BuilderCar {
        private String name;
        private String color;
        private int maxSpeed;

        public BuilderCar(String name) {
            this.name = name;
        }

        public BuilderCar setColor(String color) {
            this.color = color;
            return this;
        }

        public BuilderCar setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public SportCar build() {
            return new SportCar(this);
        }
    }


}