package Animal;

public class Dog extends Animal{
    public final int maxDistanceRun = 500;
    public final int maxDistanceSwim = 10;

    public Dog(String name){
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
        if(distance <= maxDistanceSwim){
            System.out.println(name + " проплыл " + distance + " м." );
        } else {
            System.out.println(name + " проплыл " + maxDistanceSwim + " м." );
        }
    }
}
