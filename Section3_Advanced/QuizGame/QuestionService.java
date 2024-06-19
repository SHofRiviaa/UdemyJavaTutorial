package Section3_Advanced.QuizGame;

import java.util.Scanner;

public class QuestionService {
    
    Question questions[] = new Question[3];

    public QuestionService() {
        questions[0] = new Question(1, "What is the capital of India?", new String[]{"Mumbai", "Delhi", "Chennai", "Kolkata"}, "delhi");
        questions[1] = new Question(2, "What is the capital of USA?", new String[]{"New York", "Washington DC", "Los Angeles", "Chicago"}, "washington DC");
        questions[2] = new Question(3, "What is the capital of UK?", new String[]{"Manchester", "Birmingham", "London", "Liverpool"}, "london");
    }

    public void playQuiz() {
        int score = 0;
        System.out.println("Starting the quiz...");

        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestion());
            String options[] = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println(i + 1 + ". " + options[i]);

            }
            System.out.println("Enter your answer: ");
            String userAnswer = scanner.next().toLowerCase();

            if (userAnswer.equals(question.getCorrectAnswer())) {
                score++;
                System.out.println("Correct answer!");
            }
            else {
                System.out.println("Wrong answer!");
            }
        }
        scanner.close();
        System.out.println("Your score is: " + score);
        
    }
}
