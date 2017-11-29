package lesson8.homework.forum;

public class Moderator extends User {


    public void blockComment(User user) {
        System.out.println("I can erase a comment from " + user.getName());
    }
}
