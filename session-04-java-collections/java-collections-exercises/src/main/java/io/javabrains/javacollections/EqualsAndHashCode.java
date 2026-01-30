package io.javabrains.javacollections;

/*
Generate a Person class with the member variables firstName, lastName, age, lastModifiedDate.
Generate equals and hashcode methods using member variables firstName, lastName, age
Compare two instances of Person that have the same data
*/

import java.util.Date;
import java.util.Objects;

public class EqualsAndHashCode {

    public static void main(String[] args) {

        Person p1 = new Person("Foo", "Bar", 25);
        Person p2 = new Person("Foo", "Bar", 25);

        System.out.println(p1.equals(p1));
        System.out.println(p1.hashCode() == p2.hashCode());
    }



}

 class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private Date lastModifiedDate;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj ==null || this.getClass()!=obj.getClass()){
            return false;
        }
        Person other = (Person)obj;
        return this.age == other.age && Objects.equals(this.firstName, other.firstName) && Objects.equals(this.lastName, other.lastName);

    }

     @Override
     public int hashCode(){
         return Objects.hash(firstName, lastName, age);
     }
}
