package lesson8.university;



public class UniversityMain {

    public static void main(String[] args) {

        //all Student methods
        System.out.println("---Student methods---");

        Student student = new Student();
        student.setContractNumber("123");
        student.study();
        System.out.println("Student number: " + student.getContractNumber());
        System.out.println();

        //all Teacher methods
        System.out.println("---Teacher methods---");
        Teacher teacher = new Teacher();
        teacher.setContractNumber("777");
        teacher.study();
        teacher.teach();
        System.out.println("Teacher number: " + teacher.getContractNumber());
        System.out.println();

        //all Director methods
        System.out.println("---Director methods---");
        Director director = new Director();
        director.setContractNumber("999");
        director.study();
        director.teach();
        director.hireTeacher(teacher);
        director.fireTeacher(teacher);
        System.out.println("Director number: " + director.getContractNumber());
        System.out.println();

        //all JuniorDeveloper methods
        System.out.println("---Junior Deeveloper---");
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        juniorDeveloper.setContractNumber("111Developer");
        juniorDeveloper.study();
        juniorDeveloper.writeCode();
        juniorDeveloper.askStupidQuestion();
        System.out.println("Junior Developer Number: " + juniorDeveloper.getContractNumber());
        System.out.println();

        //all MiddleDeveloper methods
        System.out.println("---Middle Deeveloper---");
        MiddleDeveloper middleDeveloper = new MiddleDeveloper();
        middleDeveloper.setContractNumber("222Developer");
        middleDeveloper.study();
        middleDeveloper.writeCode();
        middleDeveloper.askStupidQuestion();
        middleDeveloper.debugCode();
        System.out.println("Midddle Developer Number: " + middleDeveloper.getContractNumber());
        System.out.println();

        //all SeniorDeveloper methods
        System.out.println("---Senior Deeveloper---");
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();
        seniorDeveloper.setContractNumber("333Developer");
        seniorDeveloper.study();
        seniorDeveloper.writeCode();
        seniorDeveloper.askStupidQuestion();
        seniorDeveloper.debugCode();
        seniorDeveloper.solveProblem();
        System.out.println("Senior Developer Number: " + seniorDeveloper.getContractNumber());
        System.out.println();
    }
}
