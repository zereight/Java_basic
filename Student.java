public class Student extends Person {

    private int grade;
    private float score;
    
    public int getGrade(){
        return this.grade;
    }

    public float getScore(){
        return this.score;
    }

    public void setGrade(int _grade) {
        this.grade = _grade;
    }

    public void setScore(int _score) {
        this.score = _score;
    }

    public Student(String _name, int _age, String _gender,int _grade, float _score){
        super(_name, _age, _gender);
        this.grade = _grade;
        this.score = _score;
    }

    

}