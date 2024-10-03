package more_on_classes;

interface M{
    void eat();
}
class inter implements M{

    @Override
    public void eat() {
        System.out.println("inter");
    }
}
