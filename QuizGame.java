import java.util.Scanner;

public class QuizGame {
    private static final String[] questions = {
        "What is the capital of France?",
        "Who wrote 'Romeo and Juliet'?",
        "What is the chemical symbol for water?",
        "Who is the artist behind the famous painting Starry Night?",
        "Which element is the most abundant in the Earth's atmosphere?",
        "What is the largest ocean on Earth?",
        "What is the boiling point of water in degrees Celsius?",
        "Which is the largest desert in the world?",
        "In which year did World War II begin?",
        "Which country hosted the 2020 Summer Olympics?"

    };
    private static final String[] options = {
        "A) Paris  B) London  C) Berlin",
        "A) William Shakespeare  B) Jane Austen  C) Charles Dickens",
        "A) Wo  B) Wa  C) H2O",
        "A) Ernest Hemingway B) Gunter Grass  C) Vincent van Gogh",
        "A) Hilium  B) Nitrogen  C) Oxygen",
        "A) Pacific Ocean B)Indian Ocean C) Atlantic Ocean",
        "A)100°C B)143°C C) 94°C",
        "A)Great Australian B)Antarctic  C)  Sahara",
        "A)1939 B)1907 C) 1933",
        "A)USA B)Japan C)Brazil "
    };
    private static final char[] answers = {'A', 'A', 'C','C','B','A','A','C','A','B'};
    private static final int QUESTION_COUNT = questions.length;
    private static final int MAX_SCORE = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz Game!");

        for (int i = 0; i < QUESTION_COUNT; i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            System.out.println(questions[i]);
            System.out.println(options[i]);

            System.out.print("Enter your answer (A, B, or C): ");
            char userAnswer = Character.toUpperCase(scanner.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score += 1;
            } else {
                System.out.println("Incorrect. The correct answer is " + answers[i]);
            }
        }

        int percentage = (score * 100) / MAX_SCORE;
        System.out.println("\nQuiz Complete!");
        System.out.println("Your score: " + score + "/" + MAX_SCORE);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 70) {
            System.out.println("Congratulations! You passed the quiz.");
        } else {
            System.out.println("Sorry, you did not pass the quiz. Better luck next time!");
        }
    }
}
