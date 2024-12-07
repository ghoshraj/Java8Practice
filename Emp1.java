package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
public class Emp1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(45, "Bob"),
                new Person(60, "Alice"),
                new Person(55, "Charlie"),
                new Person(70, "David")
        );
        List<Person>sorted = people.stream().filter((i) -> i.id > 50).sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());
        System.out.println(sorted);

    }
}
