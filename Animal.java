public class Animal {
    public String name;
    public String bark;

    public void print() {
        System.out.println(name +" is "+bark);
    }

    public Animal() {
        this.name = "unkown animal";
        this.bark = "???";
    }

}