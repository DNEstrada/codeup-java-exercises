package src;

public class ArraysExercise {
     public static void main(String[] args) {
          int[] numbers = {1, 2, 3, 4, 5};
          System.out.println(numbers); // prints out the object reference

          Person[] personGroup = new Person[3];
          personGroup[0] = new Person("Daniel");
          personGroup[1] = new Person("Nathan");
          personGroup[2] = new Person("Casper");
//          for (Person person : personGroup) {
//               System.out.println(person.sayHello());
//          }
          Person Mark = new Person("Mark");
          Person[] SecondArray = addPerson(personGroup, Mark);
          for (Person person : SecondArray) {
               System.out.println(person.sayHello());
          }
     }

     public static Person[] addPerson(Person[] personGroup, Person person) {
          Person[] newArray = new Person[personGroup.length + 1];
          newArray[newArray.length-1] = person;
          return newArray;
     }
}
