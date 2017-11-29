package lesson8.university;

public class SeniorDeveloper extends MiddleDeveloper {

    public void solveProblem() {
        System.out.println("I'm solving problem!");
    }

    @Override
    public void askStupidQuestion() {
        System.out.println("I don't ask stupid questions!");
    }
}
