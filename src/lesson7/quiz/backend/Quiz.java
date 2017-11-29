package lesson7.quiz.backend;


import lesson7.quiz.backend.answer.Answer;
import lesson7.quiz.backend.answer.AnswerStorage;
import lesson7.quiz.backend.question.Question;
import lesson7.quiz.backend.question.QuestionStorage;

public class Quiz {

    private QuestionStorage questionStorage;
    private AnswerStorage answerStorage;
    private Question currentQuestion;


    public Quiz() {
        questionStorage = new QuestionStorage();
        answerStorage = new AnswerStorage();
    }


    public Question getQuestion() {
        Question question = null;
        boolean notFound = true;
        while (notFound) {
            currentQuestion = questionStorage.getRandomQuestion();
            if (!answerStorage.isQuestionAnswered(currentQuestion)) {
                notFound = false;
            }
        }

        return currentQuestion;
    }

    public void answer(String answer) {
        answerStorage.addAnswer(new Answer(currentQuestion, answer));
    }

    public int getScore() {
        return answerStorage.getCorrectAnswerCount() * 2;
    }
}
