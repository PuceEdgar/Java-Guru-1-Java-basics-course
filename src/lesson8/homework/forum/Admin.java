package lesson8.homework.forum;

public class Admin extends Moderator {

    public void blockUser(User user) {
        System.out.println("I can block a user: " + user.getName());
    }
}
