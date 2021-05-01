import java.util.Scanner;

public class Question {

    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private int rightAnswer;

    public int getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(int rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public Question(String question, String answer1, String answer2, String answer3, String answer4, int rightAnswer) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.rightAnswer = rightAnswer;
    }

    public boolean answerTheQuestion(){
        Scanner sc = new Scanner(System.in);
        int questionNumber = sc.nextInt();
        if (rightAnswer == questionNumber){
            System.out.println("Правильный ответ!");
            return true;
        }
        else {
            System.out.println("Неправильный ответ!");
            return false;
        }
    }

    public void info(){
        System.out.println("Вопрос: " + question + "\n"
                + "Ответ 1: " + answer1 + "\n"
                + "Ответ 2: " + answer2 + "\n"
                + "Ответ 3: " + answer3 + "\n"
                + "Ответ 4: " + answer4 + "\n"
        );
    }

}
//        switch (questionNumber){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//        }