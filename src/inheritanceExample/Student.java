package inheritanceExample;

public class Student extends Person{
    private String studentId;

    public Student(String firstName, String lastName, String studentId){
        super(firstName, lastName);
        this.studentId = studentId;

    }

    public String getStudentId(){
        return studentId;
    }

    public void setStudentId(String newStudentId){
        this.studentId = newStudentId;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Student ID: " + studentId;
    }
}
