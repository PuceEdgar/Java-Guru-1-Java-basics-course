package lesson7.quiz.backend.answer;

import lesson7.quiz.backend.question.Question;

import java.util.ArrayList;
import java.util.List;

public class AnswerStorage {

    private List<Answer> answers;

    public AnswerStorage() {
        answers = new ArrayList<>();
    }

    public void addAnswer(Answer answer) {
        this.answers.add(answer);
    }

    public boolean isQuestionAnswered(Question question) {
        for (int i = 0; i < answers.size(); i++) {
            Answer answer = answers.get(i);
            if (answer.getQuestion().equals(question)) {
                return true;
            }
        }

        return false;
    }

    public int getCorrectAnswerCount() {
        int sum = 0;
        for (int i = 0; i < answers.size(); i++) {
            Answer answer = answers.get(i);
            if (answer.isCorrect()) {
                sum++;
            }
        }

        return sum;
    }
}
