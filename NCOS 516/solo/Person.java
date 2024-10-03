package solo;

public class Person{
    String name;
    int age;
    Person(String name){

        this.name = name;
    }
    int getAge(){

        return age;
    }
    void setAge(int age)
    {
        this.age = age;
    }
    public static void makeNoise()
    {
        System.out.println(" is making noise");
    }
}
