package java8;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

}

public class PredicatePerson {

    public static void main(String[] args) {

        Person p1 = new Person("John", 26);
        Person p2 = new Person("Smith", 16);
        Person p3 = new Person("Raju", 36);
        Person p4 = new Person("Rani", 6);

        List<Person> persons = Arrays.asList(p1, p2, p3, p4);

        Predicate<Person> predicate= a -> a.age > 18;

        for(Person person: persons){
            if(predicate.test(person)){
                System.out.println(person.name);
            }
        }

    }
}
