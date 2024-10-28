public abstract class Animal {

    protected ISound sound;

    public void setSound(ISound newSound) {
        this.sound = newSound;
    }

    public void makeSound() {
        this.sound.sound();
    }

    public abstract void display();

    @Override
    public String toString() {
        return "Animal{" +
                "sound=" + this.sound +
                '}';
    }
}
