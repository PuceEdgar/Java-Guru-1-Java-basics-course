package lesson8.homework.forum;

public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void readComment() {
        System.out.println("I can read a comment!");
    }

    public void writeComment(String comment) {
        System.out.println(comment);
    }

}
