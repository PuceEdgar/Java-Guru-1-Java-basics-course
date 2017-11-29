package lesson8.university;

public class CastTest {

    public static void main(String[] args) {

        SeniorDeveloper senior = new SeniorDeveloper();

        //this is UPCAST and it's safe
        //Student student = (Student) senior;
        Student student = senior;
        student.study();
        //can't use other methods except Student
        //student.writeCode();


        //this is a DOWNCAST, it's NOT SAFE!
        //so it should be done with check on instanceof!
        SeniorDeveloper sameSenior = null;
        if (student instanceof SeniorDeveloper) {
            sameSenior = (SeniorDeveloper) student;
        }

        Teacher teacher = new Teacher();
        student = teacher;


        //student isn't SeniorDeveloper
        //so program will crash with ERROR
        boolean isSenior = student instanceof SeniorDeveloper;
        System.out.println("Is student SeniorDeveloper: " + isSenior);
        SeniorDeveloper notSenior = (SeniorDeveloper) student;
    }
}
