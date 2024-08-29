public class Person {
     String name;
     String surname;

    public Person(String name, String surname) {
        this.name=name;
        this.surname=surname;
    }

    @Override
    public String toString() {
        return name+" "+surname;
    }
    public static void changePerson(Person person){
        person = new Person("Iliya", "Lagutenko");
    }

    public static void main(String[] args) {
        Person person = new Person("Lyapis","Nrubeckoy");
        changePerson(person);
        System.out.println(person);
    }
}
