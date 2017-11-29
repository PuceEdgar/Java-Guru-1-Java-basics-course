package lesson7.quiz.backend.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionStorage {

    private List<Question> questions;

    public QuestionStorage() {
        questions = new ArrayList<>();
        questions.add(new Question("1 + 1 = ?", "2"));
        questions.add(new Question("1 + 2 = ?", "3"));
        questions.add(new Question("1 + 3 = ?", "4"));
        questions.add(new Question("1 + 4 = ?", "5"));
        questions.add(new Question("1 + 5 = ?", "6"));
        questions.add(new Question("1 + 6 = ?", "7"));
        questions.add(new Question("1 + 7 = ?", "8"));
        questions.add(new Question("1 + 8 = ?", "9"));
        questions.add(new Question("1 + 9 = ?", "10"));
        questions.add(new Question("1 + 10 = ?", "11"));

    }

    public Question getRandomQuestion() {
        Random random = new Random();
        int randomNumber = random.nextInt(questions.size());
        return questions.get(randomNumber);
    }
}
