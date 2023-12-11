package src;

public class Person {
     private String name;

     public static void main(String[] args) {
//          Person Daniel = new Person("Daniel");
//          Daniel.getName();
//          Daniel.sayHello();

//          Person person1 = new Person("John"); // prediction: first line returns true, 2nd returns false, not able to directly compare objects
//          Person person2 = new Person("John");
//          System.out.println(person1.getName().equals(person2.getName()));
//          System.out.println(person1 == person2);

//          Person person1 = new Person("John"); // prediction: 2nd line will error as it is not defining new person
//          Person person2 = person1; // actual: person2 is copy of person1 and returns true as it has same reference
//          System.out.println(person1 == person2);

//          Person person1 = new Person("John"); // prediction: they both have same reference, so they will both output same names
//          Person person2 = person1;
//          System.out.println(person1.getName());
//          System.out.println(person2.getName());
//          person2.setName("Jane");
//          System.out.println(person1.getName());
//          System.out.println(person2.getName());
     }

     public Person(String name) {
          this.setName(name);
     }

     public String getName(){
//TODO: return the person's name
          return this.name;
     }

     public void setName(String name){
//TODO: change the name field to the passed value
          this.name = name;
     }
     public void sayHello(){
//TODO: print a message to the console using the person's name
          System.out.printf("The person is %s\n", this.name);
     }
}
