# Simple Math App ➕➖✖️➗

This is a basic math practice app for Android, implemented in Kotlin. It allows users to answer random math questions, receive immediate feedback, and choose from various operations.

## Features ✨

- **Math Operations**: Select from addition, subtraction, multiplication, and division.
- **Randomized Questions**: Questions are generated randomly for each operation.
- **Answer Submission**: Users submit answers and receive instant feedback.
- **Audio Feedback**: Correct and incorrect answers trigger unique sounds.
- **Visual Feedback**: Displays a message and image indicating if the answer was correct or incorrect.

## Activities 📱
### MainActivity
- **Purpose**: Displays a random math question, accepts user answers, and navigates to feedback upon submission.
- **UI Components**:
 - `questionView (TextView)`: Shows the math question.
 - `answerView (EditText)`: Allows users to input their answer.
 - `answerButton (Button)`: Submits the answer for validation.
 - `Operation Buttons (Buttons)`: Let users select the math operation (addition, subtraction, multiplication, division).
- **Key Functions**:
 - `setNewQuestion()`: Generates and displays a new question based on the chosen operation.
 - `handleAnswer()`: Validates the answer, plays appropriate audio feedback, and navigates to AnswerActivity.
 - `checkAnswer()`: Compares the user’s answer with the correct answer.
### AnswerActivity
- **Purpose**: Shows feedback on whether the submitted answer was correct or incorrect.
- **UI Components**:
 - `resultView (TextView)`: Displays "Correct Answer" or "Incorrect Answer."
 - `resultImageView (ImageView)`: Shows an icon indicating if the answer was correct or incorrect.
 - `backButton (Button)`: Returns to MainActivity for another question.
- **Intent Extra**:
 - `answeredCorrect (Boolean)`: Passed from MainActivity to indicate if the answer was correct.

## Resources 🎨
 - **Images**:
  - `correct.png`: Shown when the answer is correct.
incorrect.png: Shown when the answer is incorrect.
 - **Audio**:
  - `correct.mp3`: Plays upon a correct answer.
  - `wrong.mp3`: Plays upon an incorrect answer.

## Usage 🛠️
 1. **Launch the App**: Open the app on an Android device or emulator.
 2. **Choose an Operation**: Select one of the operation buttons (add, subtract, multiply, or divide).
 3. **Answer the Question**: Enter an answer and press "Submit."
 4. **Receive Feedback**: Get instant visual and audio feedback on whether the answer was correct.
 5. **Return**: Press "Back" to try another question.

## Setup 📦
1. Clone the repository and open the project in Android Studio.
2. Place correct.mp3 and wrong.mp3 in res/raw for audio feedback.
3. Add correct.png and incorrect.png to res/drawable for visual feedback.
4. Build and run the app on an Android device or emulator.

## Author
Jonas N

This README.md file provides an overview of the project, describes its features, and details its usage and setup. 😊
