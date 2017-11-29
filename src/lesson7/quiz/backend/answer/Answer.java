package lesson7.quiz.backend.answer;

import lesson7.quiz.backend.question.Question;

import java.util.List;

public class Answer {

    private Question question;
    private boolean correct;

    public Answer(Question question, String answer) {
        this.question = question;
        this.correct = question.verifyAnswer(answer);
    }

    public boolean isCorrect() {
        return correct;
    }

    public Question getQuestion() {
        return question;
    }
}
