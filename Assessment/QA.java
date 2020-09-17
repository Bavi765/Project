import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QA {
    static ArrayList<question> questions = new ArrayList<question>();

    public static void main(String[] args) {
        System.out.print("Enter 1 to Ask a Question\nEnter 2 to Add a Question\nEnter an Option : ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if (option == 1 || option == 2) {
            if (option == 1) {
                boolean found = false;
                System.out.print("Enter a Question : ");
                scanner = new Scanner(System.in);
                String quest1 = scanner.nextLine();
                for (question q : questions) {
                    String str = q.quest;
                    if (str.equals(quest1)) {
                        found = true;
                        System.out.println("Question : " + q.quest + "?");
                        System.out.println("Answers : ");
                        for (String s : q.answers) {
                            if ((!s.isEmpty()) && (!s.isBlank())) {
                                System.out.println("-> " + s);
                            }
                        }
                    }
                    if(found == false){
                        System.out.println("the answer to life, universe and everything is 42");
                    }
                }
                main(args);
            }
            if (option == 2) {
                System.out.println("Enter the new Question in this Format");
                System.out.println("<question>? “<answer1>” “<answer2>” “<answerX>”");
                scanner = new Scanner(System.in);
                String quest1 = scanner.nextLine();
                question newQuestion = new question();
                String[] result = quest1.split("[?]");
                System.out.println("Question You Entered is : " + result[0]);
                if (result[1].isEmpty()) {
                    System.out.println("Please Add At Least one answer");
                    main(args);
                }
                String[] answers = result[1].split("[\"]");
                System.out.println("Answers You Entered are : " + Arrays.toString(answers));
                newQuestion.quest = result[0];
                System.out.println(newQuestion.quest);
                newQuestion.answers = answers;
                newQuestion.checkChars();
                questions.add(newQuestion);
                main(args);
            }
        } else {
            System.out.println("Enter a Valid Input " + questions.size());
            main(args);
        }
    }
}
