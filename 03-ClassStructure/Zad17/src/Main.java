import java.util.Arrays;

public class Main {
    public static class StudentGrades {

        String studentName;
        double[] grades;

        StudentGrades(String name, double[] grades) {
            this.studentName = name;
            this.grades = grades;
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
        StudentGrades studentGrades1 = new StudentGrades("Amanda", new double[] {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5});
        StudentGrades studentGrades2 = new StudentGrades("James", new double[] {2.0, 3.0, 2.0, 4.5, 4.5});


        studentGrades1.displayStudent();
        studentGrades2.displayStudent();
    }
}