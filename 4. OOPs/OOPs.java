public class OOPs {

    public static class Person {
        int age;
        String name;

        void sayHi() {
            System.out.println(name + "[" + age + "] say hi");
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 10;
        p1.name = "A";
        p1.sayHi();

        Person p2 = new Person();
        p2.age = 20;
        p2.name = "B";
        p2.sayHi();
    }
}
