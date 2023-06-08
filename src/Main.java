import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Question> questions = new ArrayList<>();

        questions.add(new Question("Question vkazivni 1?",
                new ArrayList<>(Arrays.asList("a", "b", "c","d")), "b"));
        questions.add(new Question("Question vkazivni 2?",
                new ArrayList<>(Arrays.asList("a", "b", "c","d")), "c"));
        questions.add(new Question("Question vkazivni 3?",
                new ArrayList<>(Arrays.asList("a", "b", "c","d")), "a"));
        questions.add(new Question("Question vkazivni 4?",
                new ArrayList<>(Arrays.asList("a", "b", "c","d")), "d"));
        questions.add(new Question("Question vkazivni 5?",
                new ArrayList<>(Arrays.asList("a", "b", "c","d")), "d"));

        Test test = new Test(questions);


        test.showTest();
    }


    private static class Question {

        private String _question;
        private List<String> _questions;
        private String _correctAnswer;

        public Question(String question, List<String> questions, String correctAnswer) {
            _question = question;
            _questions = questions;
            _correctAnswer = correctAnswer;
        }

        public Question() {

        }

        public boolean askQuestion() {
            System.out.println(_question);
            Scanner scanner = new Scanner(System.in);
            for (Integer i = 0; i < _questions.size(); i++) {
                System.out.println((i + 1) + ") " + _questions.get(i));

            }
            System.out.println("Choose the correct (a,b,c,d):");
            String userAnswer = scanner.nextLine(); 
            while(userAnswer.)
             userAnswer = scanner.nextLine();

            if (userAnswer.equals(_correctAnswer)) {
                return true;
            }

            return false;

        }

    }

    private static class Test {
        private List<Question> questions;

        public Test(List<Question> questions) {
            this.questions = questions;
        }

        public void showTest() {
            Integer correctAnswers = 0;
            for (Question q : questions) {
                if (q.askQuestion())
                    correctAnswers++;
            }

            System.out.println("You answered " + correctAnswers + " out of " + questions.size() + " questions");
        }
    }
}
