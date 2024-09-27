import java.util.*;

public class Swap1 {

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
        
        Person p2 = new Person();
        p2.age = 20;
        p2.name = "B";

        p1.sayHi();
        p2.sayHi();
        swap(p1, p2);
        p1.sayHi();
        p2.sayHi();
        
    }

    public static void swap(Person psn1, Person psn2){
        Person t = psn1;
        psn1 = psn2;
        psn2 = t;
    }
}
