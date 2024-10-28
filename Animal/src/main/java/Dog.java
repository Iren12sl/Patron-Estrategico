public class Dog extends Animal {
    String perro;

    public Dog() {
        sound = new Bark();
    }

    @Override
    public void display() {
        perro = "This is a Dog";
    }

    @Override
    public String toString() {
        return perro;
    }
}