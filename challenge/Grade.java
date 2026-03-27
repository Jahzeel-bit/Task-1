package challenge;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        int score;
        String grade = ""; 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Score: ");
        score = sc.nextInt();
        sc.close();

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("Your Score is: " + score + " Your Grade is: " + grade);
        } else {
            System.out.println("Input Score is not Valid");
        }
        //Using Ternary
        /*if (score >= 0 && score <= 100) {
            String grades = (score >= 90) ? "A" :
                           (score >= 80) ? "B" :
                           (score >= 70) ? "C" :
                           (score >= 60) ? "D" : "F";

            System.out.println("Your Score is: " + score + " Your Grade is: " + grades);
        } else {
            System.out.println("Input Score is not Valid"); 
        }
            */
    }
}
