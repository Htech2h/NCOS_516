package solo;

public class REf {
    static  void addOne(Person person) {
        person.setAge(person.getAge() + 1);
    }
    public static void main(String[] args) {
        Person j = new Person("htech");
        j.setAge(1);
        addOne(j);
        System.out.println(j.getAge());
        Person.makeNoise();
    }
}

