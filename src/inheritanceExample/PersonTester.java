package inheritanceExample;

public class PersonTester {
    public static void main(String[] args) {

        Person sally = new Person("Sally", "Phillips");
        System.out.println(sally);
        System.out.println("\n");

        Student mike = new Student("Mike", "Thompson", "12345");
        System.out.print(mike);
        System.out.println("\n");

        StudentEmployee jeff = new StudentEmployee("Jeff", "Sam", "45698", 38.5, "#78412");
        System.out.print(jeff);
        System.out.println("\n");

    }
}
