import java.util.*;

public class Swap2 {

    public static class Person {
        String name;
        int age;

        void sayHi() {
            System.out.println(name + "[" + age + "] say hi");
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "A";
        p1.age = 10;
        
        Person p2 = new Person();
        p2.name = "B";
        p2.age = 20;

        p1.sayHi();
        p2.sayHi();
        swap(p1, p2);
        p1.sayHi();
        p2.sayHi();
        
    }

    public static void swap(Person psn1, Person psn2){
        int age = psn1.age;
        psn1.age = psn2.age;
        psn2.age = age;

        String name = psn1.name;
        psn1.name = psn2.name;
        psn2.name = name;
    }
}
