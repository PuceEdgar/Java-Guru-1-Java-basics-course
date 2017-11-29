package lesson7.quiz;

import lesson7.quiz.backend.account.Account;
import lesson7.quiz.ui.LoginForm;
import lesson7.quiz.ui.QuizForm;

public class QuizMain {

    public static void main(String[] args) {

        LoginForm loginForm = new LoginForm();
        Account account = loginForm.login();
        QuizForm quizForm = new QuizForm(account);
        quizForm.play();

    }
}
