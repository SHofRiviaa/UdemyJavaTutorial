package Section3_Advanced.QuizGame;

import java.util.Arrays;

public class Question {
    private int id;
    private String question;
    private String options[];
    private String correctAnswer;

    public Question(int id, String question, String[] options, String correctAnswer) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String[] getOptions() {
        return options;
    }
    public void setOptions(String[] options) {
        this.options = options;
    }
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    @Override
    public String toString() {
        return "Question [id=" + id + ", question=" + question + ", options=" + Arrays.toString(options)
                + ", correctAnswer=" + correctAnswer + "]";
    }
    
    
}
