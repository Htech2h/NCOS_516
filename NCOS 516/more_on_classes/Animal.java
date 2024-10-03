package more_on_classes;
//  non-private variables and methods will be inherited

abstract class Animal {
    protected int age;
    Animal()
    {
        System.out.println("Animal Constructor");
    }
    abstract void makeSound();

}
