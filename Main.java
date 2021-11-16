package Animal;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Markiz");
        cat.run(150);
        cat.run(1000);
        cat.swim(1000);
        Dog dog = new Dog("Sharik");
        dog.run(150);
        dog.run(1000);
        dog.swim(1000);
        System.out.println(Animal.animalCounter);
        Dog dog1 = new Dog("Bobik");
        System.out.println(Animal.animalCounter);
    }
}
