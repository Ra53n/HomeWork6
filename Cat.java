package Animal;

public class Cat extends Animal{
    public final int maxDistanceRun = 200;

    public Cat(String name){
        super.name = name;
    }


    @Override
    public void run(int distance) {
        if(distance <= maxDistanceRun){
            System.out.println(name + " пробежал " + distance + " м." );
        } else {
            System.out.println(name + " пробежал " + maxDistanceRun + " м." );
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }
}
