// Import necessary classes
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.IOException;

// Define the Student class
public class Student {
    // Declare private variables for name and grades
    private String name;
    private ArrayList<Integer> grades;

    // Constructor for the Student class
    public Student(String name) {
        this.name = name; // Initialize name
        this.grades = new ArrayList<>(); // Initialize grades as an empty ArrayList
    }

    // Method to add a grade to the grades ArrayList
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // Method to calculate the average grade
    public double calculateAverage() {
        int sum = 0; // Initialize sum
        // Loop through each grade in grades
        for (int grade : this.grades) {
            sum += grade; // Add grade to sum
        }
        // Return the average (sum divided by the number of grades)
        return sum / (double) this.grades.size();
    }

    // Method to print student details
    public void printDetails() {
        double average = this.calculateAverage(); // Calculate average
        System.out.println("Name: " + this.name); // Print name
        System.out.println("Average Grade: " + average); // Print average grade
        // Check if average grade is 70 or above
        if (average >= 70) {
            System.out.println("Status: Pass"); // If so, print "Pass"
        } else {
            System.out.println("Status: Fail"); // If not, print "Fail"
        }
    }

    // Method to generate a report card and write it to a file
    public void generateReportCard() {
        try {
            // Create a PrintWriter to write to a file
            PrintWriter writer = new PrintWriter(this.name + "_ReportCard.txt", "UTF-8");
            writer.println("Name: " + this.name); // Write name to file
            writer.println("Grades: " + this.grades.toString()); // Write grades to file
            writer.println("Average Grade: " + this.calculateAverage()); // Write average grade to file
            writer.close(); // Close the PrintWriter
        } catch (IOException e) {
            // Print error message and stack trace if an IOException occurs
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }
    }
}

// Define the Main class
public class Main {
    // Define the main method
    public static void main(String[] args) {
        Student student = new Student("John Doe"); // Create a new Student object
        student.addGrade(75); // Add a grade
        student.addGrade(85); // Add another grade
        student.addGrade(95); // Add yet another grade
        student.printDetails(); // Print student details
        student.generateReportCard(); // Generate a report card
    }
}
