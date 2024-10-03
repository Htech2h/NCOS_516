package more_on_classes;

public class Encapsulation {
    private int age;
    int getAge()
    {
        return age;
    }
    void setAge(int age)
    {

        if(age >= 18){
            this.age = age;
            System.out.println("You are now 18 years old");
        }else{
            System.out.println("You are (NOT) old 18 years old..sorry");
        }
    }
}
