/*
* This program is a simple math quiz
* The User determines how many equations they want to solve
* The program will display how many equations the user got correct
* out of all the equations answered.
* Eliana Tristan
* 06/19/2026
* JDK Version 26
*/

package simplemathquiz;

import javax.swing.JOptionPane;

public class SimpleMathQuiz {

    public static void main(String[] args) {

        double percentage = 0;

        while (percentage < 70) {

            int questions;

            do {
                questions = Integer.parseInt(
                        JOptionPane.showInputDialog(null,
                                "How many questions would you like to solve?"));
            } while (questions <= 0);

            int correct = 0;

            for (int i = 1; i <= questions; i++) {

                int num1 = (int)(Math.random() * 50) + 1;
                int num2 = (int)(Math.random() * 50) + 1;

                int answer = Integer.parseInt(
                        JOptionPane.showInputDialog(null,
                                num1 + " + " + num2 + " = ?"));

                if (answer == num1 + num2) {
                    JOptionPane.showMessageDialog(null, "Correct");
                    correct++;
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect");
                }
            }

            //calculate percentage
            percentage = (double) correct / questions * 100;

            //round to one decimal place
            percentage = (int)(percentage * 10);
            percentage = percentage / 10;

            //display results
            JOptionPane.showMessageDialog(null,
                    "You got " + correct
                    + " out of " + questions
                    + " correct which is "
                    + percentage + "%.");

            if (percentage >= 70) {
                JOptionPane.showMessageDialog(null,
                        "You passed this addition quiz. Congratulations!");
            } else {
                JOptionPane.showMessageDialog(null,
                        "You did not pass this addition quiz. Please try again.");
            }
        }
    }
}
