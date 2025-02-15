public class TestingPerson {
    public static void main(String[] args) {
        Student sd1= new Student("A", "123 Abc", "xyz", 2000, 12000);
        System.out.println(sd1.toString());

        Staff sf1= new Staff("B", "456 Def", "IT", 20000);
        System.out.println(sf1.toString());
    }
}
