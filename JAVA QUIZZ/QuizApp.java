import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizApp {

    private String[] questions = {
            "1. What is Java?",
            "2. Which keyword is used to define a constant in Java?",
            "3. Which collection class in Java is synchronized?",
            "4. What is the default value of a boolean variable in Java?",
            "5. Which access modifier is used for a method that should be accessible only within its own package?",
            "6. Number of primitive data types in Java are?",
            "7. JDK stands for ____",
            "8. JRE stands for ___",
            "9. Which class in Java is used to take input from the user?",
            "10. Method used to take a string as input in Java?",
    };

    private String[] correctAnswers = {"C) Programming language", "A) final", "C) Vector","A) false","D) default","C) 8","A) Java development kit","C) Java Runtime Environment","D) Both A. and B","C) Both A. and B",};
    private String[][] options = {
            {"A) Scripting language", "B) Markup language", "C) Programming language", "D) Database language"},
            {"A) final", "B) const", "C) static", "D) constant"},
            {"A) ArrayList", "B) LinkedList", "C) Vector", "D) HashSet"},
            {"A) false", "B) true", "C) 0", "D) 1"},
            {"A) public", "B) private", "C) protected", "D) default"},
            {"A) 6", "B) 7", "C) 8", "D) 9"},
            {"A) Java development kit", "B) Java deployment kit", "C) JavaScript deployment kit", "D) None of these"},
            {"A) Java run ecosystem", "B) JDK runtime Environment", "C) Java Runtime Environment", "D) None of these"},
            {"A) Scanner", "B) BufferReader", "C) Input", "D) Both A. and B"},
            {"A) next()", "B) nextLine()", "C) Both A. and B", "D) None of these"},
    };

    private int score = 0;
    private int currentQuestionIndex = 0;

    private JFrame frame;
    private JLabel questionLabel;
    private JRadioButton optionA, optionB, optionC, optionD;
    private ButtonGroup buttonGroup;
    private JButton submitButton;

    public QuizApp() {
        frame = new JFrame("Quiz Application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 1));

        questionLabel = new JLabel(questions[currentQuestionIndex]);

        optionA = new JRadioButton(options[currentQuestionIndex][0]);
        optionB = new JRadioButton(options[currentQuestionIndex][1]);
        optionC = new JRadioButton(options[currentQuestionIndex][2]);
        optionD = new JRadioButton(options[currentQuestionIndex][3]);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(optionA);
        buttonGroup.add(optionB);
        buttonGroup.add(optionC);
        buttonGroup.add(optionD);

        submitButton = new JButton("Submit");

        frame.add(questionLabel);
        frame.add(optionA);
        frame.add(optionB);
        frame.add(optionC);
        frame.add(optionD);
        frame.add(submitButton);

        addListeners();

        frame.setVisible(true);
    }

    private void addListeners() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnswer();
                if (currentQuestionIndex < questions.length - 1) {
                    currentQuestionIndex++;
                    updateQuestion();
                } else {
                    JOptionPane.showMessageDialog(frame, "Your final score is: " + score);
                    System.exit(0);
                }
            }
        });
    }

    private void updateQuestion() {
        questionLabel.setText(questions[currentQuestionIndex]);
        optionA.setText(options[currentQuestionIndex][0]);
        optionB.setText(options[currentQuestionIndex][1]);
        optionC.setText(options[currentQuestionIndex][2]);
        optionD.setText(options[currentQuestionIndex][3]);

        buttonGroup.clearSelection();
    }

    private void checkAnswer() {
        if (optionA.isSelected() && optionA.getText().equalsIgnoreCase(correctAnswers[currentQuestionIndex])) {
            score++;
        } else if (optionB.isSelected() && optionB.getText().equalsIgnoreCase(correctAnswers[currentQuestionIndex])) {
            score++;
        } else if (optionC.isSelected() && optionC.getText().equalsIgnoreCase(correctAnswers[currentQuestionIndex])) {
            score++;
        } else if (optionD.isSelected() && optionD.getText().equalsIgnoreCase(correctAnswers[currentQuestionIndex])) {
            score++;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QuizApp();
            }
        });
    }
}
