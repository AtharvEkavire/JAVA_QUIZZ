# JAVA_QUIZZ

# Overview
JavaQuiz is a simple quiz application written in Java using Swing for the graphical user interface. The application presents a series of multiple-choice questions, allowing users to select their answers and submit them. At the end of the quiz, the user's final score is displayed.

# Features
1. User-friendly GUI with a question label, radio buttons for answer options, and a submit button.
2. Multiple-choice questions covering various Java programming concepts.
3. Dynamic question updating and scoring mechanism.
4. The application terminates and displays the final score after completing all questions.

# Usage
1. Clone the repository:
   git clone https://github.com/AtharvEkavire/JavaQuiz.git

2. Compile the Java file:
   javac QuizApp.java

3. Run the compiled program:
   java QuizApp

4. Answer each question by selecting the appropriate radio button and click the "Submit" button.
5. After completing all questions, the application will display your final score.

# Dependencies
Java Development Kit (JDK) version 8 or higher.
Code Structure
The main logic of the quiz application is contained in the QuizApp class, which includes the question data, answer choices, and the graphical user interface components. The addListeners, updateQuestion, and checkAnswer methods handle event listeners, question updating, and answer checking, respectively.

# Future Improvements
Adding a timer to limit the time for each question.
Storing questions and answers in an external file for easy modification and extension.
Implementing a more visually appealing user interface.
Feel free to contribute to the project by addressing any of these potential improvements or suggesting new features!

License
This project is licensed under the MIT License - see the LICENSE file for details.

