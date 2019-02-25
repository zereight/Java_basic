public class Dog extends Animal{
    private String name;
    private boolean isAlive;
    
    void Crying() {
        System.out.println("Cryiiiinnnnngggg");
    }

    void Kill() {
        System.out.println("Kill it");
    }

    public Dog() {
    }

    public Dog(String name, boolean isAlive) {
        this.name = name;
        this.isAlive = isAlive;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsAlive() {
        return this.isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

}