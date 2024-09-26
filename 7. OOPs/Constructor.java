public class Constructor {

    public static class Person {
        int age;
        String name;

        void sayHi() {
            System.out.println(name + "[" + age + "] say hi");
        }

        // If we forget, java provides our class a Default Constructor
        Person(){
            // Constructor
        }

        // parametrized
        Person(int age, String name){
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 10;
        p1.name = "A";
        p1.sayHi();

        Person p2 = new Person(20, "B");
        p2.sayHi();
    }
}
