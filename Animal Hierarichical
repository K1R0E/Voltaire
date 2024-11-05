package animal;


class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void eat() {
        System.out.println(name + " eats food.");
    }
}


class Mammal extends Animal {
    private String furColor;

    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }


    public String getFurColor() {
        return furColor;
    }

    void walk() {
        System.out.println(getName() + " walks.");
    }
}


class Bird extends Animal {
    private double wingSpan;

    public Bird(String name, int age, double wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }


    public double getWingSpan() {
        return wingSpan;
    }

    void fly() {
        System.out.println(getName() + " flies.");
    }
}


class Dog extends Mammal {
    private String breed;

    public Dog(String name, int age, String furColor, String breed) {
        super(name, age, furColor);
        this.breed = breed;
    }


    public String getBreed() {
        return breed;
    }

    void bark() {
        System.out.println(getName() + " the " + breed + " barks.");
    }
}


class Eagle extends Bird {
    private double beakLength;

    public Eagle(String name, int age, double wingSpan, double beakLength) {
        super(name, age, wingSpan);
        this.beakLength = beakLength;
    }


    public double getBeakLength() {
        return beakLength;
    }

    void hunt() {
        System.out.println(getName() + " with a beak length of " + beakLength + " cm hunts.");
    }
}


public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 5, "Golden", "Golden Retriever");
        dog.eat();
        dog.walk();
        dog.bark();

        Eagle eagle = new Eagle("Majestic Eagle", 3, 2.3, 7.5);
        eagle.eat();
        eagle.fly();
        eagle.hunt();
    }
}
