package lesson7.quiz.ui;

import lesson7.quiz.backend.Quiz;
import lesson7.quiz.backend.account.Account;
import lesson7.quiz.backend.question.Question;

import java.util.Scanner;

public class QuizForm {

    private Quiz quiz;
    private Account account;

    public QuizForm(Account account) {
        quiz = new Quiz();
        this.account = account;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            Question question = quiz.getQuestion();
            System.out.printf("%d. %s\n", i+1, question.getQuestion());
            System.out.println("Enter your answer: ");
            String answer = scanner.next();
            quiz.answer(answer);
        }
        System.out.println(account.getLogin() + ", your score is: " + quiz.getScore());
    }

}
