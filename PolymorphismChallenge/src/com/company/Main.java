package com.company;


class Car {
    private String name;
    private  boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "The engine has started";
    }

    public String accelerate() {
        return "Now accelerating";
    }

    public String brake() {
        return "Now braking";
    }
}

class Civic extends Car {
    public Civic() {
        super("Rick the Civic", 4);
    }

    @Override
    public String startEngine() {
        return "The engine has started in Rick the Civic";
    }

    @Override
    public String accelerate() {
        return "Now accelerating in Rick the Civic";
    }

    @Override
    public String brake() {
        return "Now braking in Rick the Civic";
    }
}

class Envoy extends Car {
    public Envoy() {
        super("Envoy that Boy", 4);
    }

    @Override
    public String startEngine() {
        return "The engine has started in Envoy that Boy";
    }

    @Override
    public String accelerate() {
        return "Now accelerating in Envoy that Boy";
    }

    @Override
    public String brake() {
        return "Now braking in Envoy that Boy";
    }
}

class Equinox extends Car {
    public Equinox() {
        super("Equinox Box", 4);
    }

    @Override
    public String startEngine() {
        return "The engine has started in Equinox Box";
    }

    @Override
    public String accelerate() {
        // getClass comes from Object class, which all classes extend off of
        return getClass().getSimpleName() + " " + "now accelerating";
    }

    @Override
    public String brake() {
        return "Now braking in Equinox Box";
    }
}

class RandomCar extends Car {
    public RandomCar() {
        super("Random", 4);

        // No other methods
    }
}

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i + " : " + car.getName() + "\n" + "accelerate() called " + car.accelerate() + "\n");
        }

    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 4) + 1;
        System.out.println("Random number generated was " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Civic();
            case 2:
                return new Envoy();
            case 3:
                return new Equinox();
            case 4:
                return new RandomCar();
            default:
                return null;
        }
    }
}
