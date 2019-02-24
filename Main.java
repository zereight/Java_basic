
public class Main {

    public static int max(int a, int b, int c) {
        int sum = a+b+c;
        return sum;
    }

    public static void main (String[] args) {

        //func
        System.out.println( max(10,20,30) );


        //java func callBy???
        Person p1 = new Person("A");
        Person p2 = new Person("B");

        Person.callByValue(p1); //no change
        Person.callByReference(p2); // change

        Person.print_Person(p1);
        Person.print_Person(p2);
    }
}

class Person {
    String name;

    public Person(String _name){
        this.name = _name;
    }

    public static void callByValue(Person _p){
        _p = new Person("a");
    }

    public static void callByReference(Person _p){
        _p.name = "b";
    }

    public static void print_Person(Person _p){
        System.out.println(_p.name);
    }

}