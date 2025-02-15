public class TestingAnimal {
    public static void main(String[] args) {
    Cat c1= new Cat("Dog");
    Dog d1= new Dog("Cat");
    c1.greets();
    System.out.println(c1.toString());
    d1.greets();
    d1.greets(d1);
    System.out.println(d1.toString());
}
}
