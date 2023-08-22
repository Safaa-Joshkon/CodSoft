//Safaa Joshkon- Task2
package task.pkg2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int subjects = scan.nextInt();
        int grade = 0;
        for (int i=1; i<=subjects; i++) {
            System.out.print("Enter marks obtained in subject "+i+": ");
            int marks = scan.nextInt();
            grade+=marks;
        }
        double average=(double) grade/ (subjects * 100) * 100;
        char finalGrade = calculateGrade(average);
        System.out.println("Total Marks: " + grade);
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + finalGrade);
    }  
    public static char calculateGrade(double score){ 
        if(score>=90.0)
            return 'A';
        else if(score>=80.0)
            return 'B';
        else if(score>=70.0)
            return 'C';
        else if(score>=60.0)
            return 'D';
        else
            return 'F';
    }
}
