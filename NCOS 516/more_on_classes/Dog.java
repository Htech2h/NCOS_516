package more_on_classes;

public class Dog extends Animal{
    Dog()
    {
        age = 12;
    }

    @Override
    public void makeSound() {
        System.out.println("woof woof");
    }
}
