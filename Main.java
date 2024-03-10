
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
