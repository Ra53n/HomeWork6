package Animal;

public abstract class Animal {
    protected String name;
    protected static int animalCounter = 0;

    public Animal(){
        animalCounter++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}
