public class Person {
    private String name;
    private int age;
    private String gender;

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getGender(){
        return this.gender;
    }

    public void setName(String _name) {
        this.name = _name;
    }
    public void setAge(int _age) {
        this.age = _age;
    }
    public void setGender(String _gender) {
        this.gender = _gender;
    }

    public Person(String _name, int _age, String _gender) {
        this.name = _name;
        this.age = _age;
        this.gender = _gender;
    }
}