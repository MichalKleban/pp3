import java.util.Arrays;
import java.util.Scanner;

public class Zad19 {
    public static class StudentGrades {

        String studentName;
        double[] grades;
        int numberOfGrades;

        StudentGrades(String name) {
            this.name= name;
            Scanner scanner = new Scanner(System.in);
            this.grades = (double) scanner.nextDouble("Enter your grades: ");

            
        
        }      

        double lowestGrade(){
            double lowest[] = this.grades;
            Arrays.sort(lowest);
            return lowest[0];
        }
        double highestGrade(){
            double highest[] = this.grades;
            Arrays.sort(highest);
            return highest[this.grades.length-1];
        }
        int numberOfGrades(){
            int sum = 0;
            for(int i =0; i<this.grades.length; i++){
                sum+=1;
            }
            return sum;
        }
        double gradeAverage(){
            double sum = 0;
            for(int i =0; i<this.grades.length; i++){
                sum+=this.grades[i];
            }
            return sum / numberOfGrades();
        }
        void displayStudent(){
            System.out.println("Student Name : " + this.studentName);
            System.out.println("List of grades : " + Arrays.toString(this.grades));
            System.out.println("Number of grades : " + this.numberOfGrades());
            System.out.println("Lowest grade : " + lowestGrade());
            System.out.println("Highest grade : " + highestGrade());
            System.out.println("Grade Average : " + gradeAverage());
        }
    }

    public static void main(String[] args){
        StudentGrades s1 = new StudentGrades("Amanda");
        StudentGrades s2 = new StudentGrades("James");

        s1.displayStudent();
        s2.displayStudent();
        
}
}