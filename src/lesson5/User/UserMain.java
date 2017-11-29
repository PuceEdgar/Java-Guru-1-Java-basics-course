package lesson5.User;

public class UserMain {

    public static void main(String[] args) {

        User user = new User("test", "try");

        /*user.verifyPassword("test");
        user.verifyPassword("test");
        user.verifyPassword("try");
        user.verifyPassword("test");
        user.verifyPassword("test");
        System.out.println(user);*/
        System.out.println(user.verifyPassword("try"));
    }
}
