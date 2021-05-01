public class Main {
    public static void main(String[]args){
        Student student = new Student();
        StudyInformation studyInformation = new StudyInformation();
        System.out.println("Пройдите модуль \"История: Средние века\", а затем пройдите тест и узнайте свой уровень компетенций в данной области!\n");
        studyInformation.printInfoAboutMiddleAges();
        System.out.println("А теперь проверьте свои знания и пройдите тест! Нажимайте номер выбранного ответа \n");
        Test test = new Test();

        test.question1.info();
        boolean correct1 = test.question1.answerTheQuestion();
        if (correct1){
            student.setHistoryKnowledge(student.getHistoryKnowledge() + 1);
        }

        test.question2.info();
        boolean correct2 = test.question2.answerTheQuestion();
        if (correct2){
            student.setHistoryKnowledge(student.getHistoryKnowledge() + 1);
        }

        test.question3.info();
        boolean correct3 = test.question3.answerTheQuestion();
        if (correct3){
            student.setHistoryKnowledge(student.getHistoryKnowledge() + 1);
        }

        test.question4.info();
        boolean correct4 = test.question4.answerTheQuestion();
        if (correct4){
            student.setHistoryKnowledge(student.getHistoryKnowledge() + 1);
        }

        test.question5.info();
        boolean correct5 = test.question5.answerTheQuestion();
        if (correct5){
            student.setHistoryKnowledge(student.getHistoryKnowledge() + 1);
        }

        test.question6.info();
        boolean correct6 = test.question6.answerTheQuestion();
        if (correct6){
            student.setHistoryKnowledge(student.getHistoryKnowledge() + 1);
        }

        test.question7.info();
        boolean correct7 = test.question7.answerTheQuestion();
        if (correct7){
            student.setHistoryKnowledge(student.getHistoryKnowledge() + 1);
        }

        test.question8.info();
        boolean correct8 = test.question8.answerTheQuestion();
        if (correct8){
            student.setHistoryKnowledge(student.getHistoryKnowledge() + 1);
        }

        test.question9.info();
        boolean correct9 = test.question9.answerTheQuestion();
        if (correct9){
            student.setHistoryKnowledge(student.getHistoryKnowledge() + 1);
        }

        test.question10.info();
        boolean correct10 = test.question10.answerTheQuestion();
        if (correct10){
            student.setHistoryKnowledge(student.getHistoryKnowledge() + 1);
        }

        System.out.println("Очки: " + student.getHistoryKnowledge() + " из 10\n");
        if(student.getHistoryKnowledge() > 8){
            System.out.println("Вы полностью освоили модуль \"История: Средние века\"!");
        } else if (student.getHistoryKnowledge() == 8 || student.getHistoryKnowledge() == 7){
            System.out.println("Вы хорошо разбираетесь в истории Средневековья, но еще не полностью освоили данный модуль!");
        } else if (student.getHistoryKnowledge() == 6 || student.getHistoryKnowledge() == 5){
            System.out.println("У вас средние познания об истории Средневековья, вы еще не освоили данный модуль");
        } else if (student.getHistoryKnowledge() < 5){
            System.out.println("Вы еще плохо освоили модуль \"История: Средние века\", пройдите его заново!");
        }
    }
}
