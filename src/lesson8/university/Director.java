package lesson8.university;

public class Director extends Teacher {

    public void hireTeacher(Teacher teacher) {
        System.out.println("I hired " + teacher.getContractNumber());
    }

    public void fireTeacher(Teacher teacher) {
        System.out.println("I fired " + teacher.getContractNumber());
    }
}
