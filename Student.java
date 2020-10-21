import java.util.Scanner;

public class Student {

    private String name;
    private double [] grades;
    private double average; 
   int noStudents;

    public Student() {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of current students: ");
	noStudents = input.nextInt();
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName () {
        return name;
    }


    
    public void setGrades(double [] grades) {
        this.grades = grades;
    }
    public double [] getGrades () {
        return grades;
    }
    public double getAvg() {

        double sum =0;
        for (int i =0; i< grades.length ; i++) {
            sum = sum + grades[i];
        }
            average = (sum) /grades.length;

    
            return average;
    }

    public void printStudentDetails () {
        System.out.println(" Student name is " + name + ", average grade is " + average + " and number of current students is " + this.noStudents);
        
    }

}