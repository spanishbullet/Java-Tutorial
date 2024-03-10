// Import necessary classes
import java.util.ArrayList;
import java.util.HashMap;
import java.io.PrintWriter;
import java.io.IOException;

// Define the Course class
class Course {
    // Declare private variables for name and credits
    private String name;
    private int credits;

    // Constructor for the Course class
    public Course(String name, int credits) {
        this.name = name; // Initialize name
        this.credits = credits; // Initialize credits
    }

    // Method to get the name of the course
    public String getName() {
        return this.name;
    }

    // Method to get the credits of the course
    public int getCredits() {
        return this.credits;
    }
}

// Define the Student class
public class Student {
    // Declare private variables for name and courses
    private String name;
    private HashMap<Course, Integer> courses;

    // Constructor for the Student class
    public Student(String name) {
        this.name = name; // Initialize name
        this.courses = new HashMap<>(); // Initialize courses as an empty HashMap
    }

    // Method to enroll in a course and record a grade
    public void enrollCourse(Course course, int grade) {
        this.courses.put(course, grade); // Add the course and grade to the courses HashMap
    }

    // Method to calculate the GPA
    public double calculateGPA() {
        int totalCredits = 0; // Initialize totalCredits
        int totalPoints = 0; // Initialize totalPoints
        // Loop through each course in courses
        for (Course course : this.courses.keySet()) {
            totalCredits += course.getCredits(); // Add the course's credits to totalCredits
            totalPoints += course.getCredits() * this.courses.get(course); // Add the course's points to totalPoints
        }
        // Return the GPA (totalPoints divided by totalCredits)
        return totalPoints / (double) totalCredits;
    }

    // Method to print student details
    public void printDetails() {
        double gpa = this.calculateGPA(); // Calculate GPA
        System.out.println("Name: " + this.name); // Print name
        System.out.println("GPA: " + gpa); // Print GPA
    }

    // Method to generate a report card and write it to a file
    public void generateReportCard() {
        try {
            // Create a PrintWriter to write to a file
            PrintWriter writer = new PrintWriter(this.name + "_ReportCard.txt", "UTF-8");
            writer.println("Name: " + this.name); // Write name to file
            writer.println("Courses: "); // Write "Courses: " to file
            // Loop through each course in courses
            for (Course course : this.courses.keySet()) {
                // Write the course's name and grade to the file
                writer.println(course.getName() + ": " + this.courses.get(course));
            }
            writer.println("GPA: " + this.calculateGPA()); // Write GPA to file
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
        // Create new Course objects
        Course math = new Course("Math", 3);
        Course english = new Course("English", 3);
        Course science = new Course("Science", 4);

        // Create a new Student object
        Student student = new Student("John Doe");
        // Enroll the student in courses and record grades
        student.enrollCourse(math, 90);
        student.enrollCourse(english, 85);
        student.enrollCourse(science, 95);
        // Print student details
        student.printDetails();
        // Generate a report card
        student.generateReportCard();
    }
}
