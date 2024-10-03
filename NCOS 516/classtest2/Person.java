package classtest2;

public class Person {
    String name;
    String lastName;
    Person(String n, String l) {
        setName(n);
        setLastName(l);
    }

    void setName(String n) {
        this.name = n;
    }
    void setLastName(String l) {
        this.lastName = l;
    }

    String getName() {
        return this.name;
    }
    String getLastName() {
        return lastName;
    }
}
