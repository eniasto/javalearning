package imperative;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new imperative.Main.Person("John", Gender.MALE),
              new imperative.Main.Person("Maria", Gender.FEMALE),
        new imperative.Main.Person("Aisha", Gender.FEMALE),
        new imperative.Main.Person("Alex", Gender.MALE),
        new imperative.Main.Person("Alice", Gender.FEMALE)
        );
        // Imperative Approach
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if(Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
            for (Person female : females){
                System.out.println(female);
            }
        }
    }
    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, imperative.Main.Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE, FEMALE
    }

}
