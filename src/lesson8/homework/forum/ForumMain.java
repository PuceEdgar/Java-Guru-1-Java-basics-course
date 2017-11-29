package lesson8.homework.forum;

public class ForumMain {

    public static void main(String[] args) {

        System.out.println("---USER---");
        User user = new User();
        user.setName("tom");
        user.writeComment("Hey! I'm a new user " + user.getName());
        user.readComment();
        System.out.println();

        System.out.println("---MODERATOR---");
        Moderator moderator = new Moderator();
        moderator.setName("bob");
        moderator.writeComment("Hey! I'm a moderator " + moderator.getName());
        moderator.readComment();
        moderator.blockComment(user);
        System.out.println();

        System.out.println("---ADMIN---");
        Admin admin = new Admin();
        admin.setName("john");
        admin.writeComment("Hey! I'm admin " + admin.getName());
        admin.readComment();
        admin.blockComment(user);
        admin.blockUser(user);
    }
}
